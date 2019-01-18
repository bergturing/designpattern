package com.berg.designpattern.singleton.action;

import java.net.Socket;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

/**
 * 端口生成器
 *
 * @author bergturing@qq.com
 * @apiNote 2018/12/10
 */
public class PortGenerator {
    /**
     * 端口默认的开始值
     */
    private static final Integer DEFAULT_PORT_START = 34567;

    /**
     * 端口默认的最大个数
     */
    private static final Integer DEFAULT_PORT_COUNT = 200;

    /**
     * 默认本机主机
     */
    private static final String DEFAULT_LOCAL_HOST = "127.0.0.1";

    /**
     * 主机
     */
    private String localHost;

    /**
     * 单例接口生成器
     */
    private static PortGenerator portGenerator;

    /**
     * 空闲的端口
     */
    private static Set<Integer> freePort = null;

    /**
     * 使用中的端口
     */
    private static Set<Integer> usingPort = null;

    /**
     * 繁忙中的端口
     */
    private static Set<Integer> busyPort = null;

    /**
     * 构造函数
     * @param configuration     配置对象
     */
    private PortGenerator(Configuration configuration){
        this.localHost = configuration.getLocalHost();

        Integer portStart = configuration.getPortStart();
        Integer portCount = configuration.getPortCount();

        freePort = new HashSet<>(portCount);
        usingPort = new HashSet<>(portCount);
        busyPort = new HashSet<>(portCount);

        //初始化空闲端口
        for (int i = 0; i < portCount; i ++){
            freePort.add(portStart + i);
        }
    }

    /**
     * 初始化接口生成器对象
     * @param configuration     接口生成器配置对象
     */
    public static void init(Configuration configuration){
        validate(configuration);
    }

    /**
     * 获取一个端口
     * @return      返回序列号
     */
    public static Integer getPort(){
        //校验对象
        validate(null);

        return portGenerator.lendPort();
    }

    /**
     * 归还端口
     * @param port      归还的端口
     * @return          是否归还成功
     */
    public static boolean returnPort(Integer port){
        //校验对象
        validate(null);

        return portGenerator.backPort(port);
    }

    /**
     * 校验接口生成器对象是否生成
     */
    private static void validate(Configuration configuration){
        if(null == portGenerator){
            synchronized (PortGenerator.class){
                if(null == portGenerator){
                    if(null == configuration){
                        configuration = new Configuration();
                    }

                    portGenerator = new PortGenerator(configuration);
                }
            }
        }
    }


    /**
     * 借出端口
     * @return      借出的端口号
     */
    private synchronized Integer lendPort(){
        if(freePort.isEmpty()){
            return null;
        }

        Integer port;
        boolean busyFlag = true;
        while (!freePort.isEmpty()){
            Optional<Integer> first = freePort.stream().findFirst();
            //判断该变量是否存在
            if(first.isPresent()){
                port = first.get();

                //从空闲的集合中移除
                freePort.remove(port);
                //如果空闲的接口为空了,就需要将以前繁忙的端口加入
                if(freePort.isEmpty() && busyFlag){
                    freePort.addAll(busyPort);
                    busyPort.clear();
                    busyFlag = false;
                }

                if(portBusy(port)){
                    //添加至繁忙的序列中
                    busyPort.add(port);
                }else {
                    //添加至使用中的集合中
                    usingPort.add(port);
                    //返回端口号
                    return port;
                }
            }
        }

        //如果空闲的接口集合为空,就说明所有接口已经使用完
        return null;
    }

    /**
     * 归还端口
     * @param port      归还的端口号
     */
    private synchronized boolean backPort(Integer port){
        //如果该端口号在使用中
        if(usingPort.contains(port)){
            //从使用中移除
            usingPort.remove(port);
            //添加至为使用的集合中
            freePort.add(port);

            return true;
        }

        return false;
    }

    /**
     * 端口处于繁忙中
     * @param port      端口号
     * @return          返回是否繁忙
     */
    private boolean portBusy(Integer port){
        if(port.equals(0)){
            return true;
        }

        try{
            //测试是否可以打开socket
            new Socket(this.localHost, port).close();
        } catch (Exception e) {
            //如果抛出了异常,就说明连接失败,说明该接口被占用了
            e.printStackTrace();
            return true;
        }

        return false;
    }


    public static class Configuration{
        /**
         * 端口的开始值
         */
        private Integer portStart = DEFAULT_PORT_START;

        /**
         * 端口的最大个数
         */
        private Integer portCount = DEFAULT_PORT_COUNT;

        /**
         * 本机主机
         */
        private String localHost = DEFAULT_LOCAL_HOST;

        private Integer getPortStart() {
            return portStart;
        }

        public void setPortStart(Integer portStart) {
            this.portStart = portStart;
        }

        private Integer getPortCount() {
            return portCount;
        }

        public void setPortCount(Integer portCount) {
            this.portCount = portCount;
        }

        private String getLocalHost() {
            return localHost;
        }

        public void setLocalHost(String localHost) {
            this.localHost = localHost;
        }
    }
}

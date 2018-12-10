package com.berg.designpattern.singleton.action;

import com.berg.designpattern.singleton.SingletonApplicationTests;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 端口生成器测试
 *
 * @author bo.he02@hand-china.com
 * @apiNote 2018/12/10
 */
public class ProtGeneratorTests extends SingletonApplicationTests {
    /**
     * 日志打印对象
     */
    private static Logger logger = LoggerFactory.getLogger(ProtGeneratorTests.class);

    @Test
    public void testGetPort() {
        //下面两种方式一次只能测试一种,
        //因为使用了单例模式,因此对生成器的配置只有在第一次配置时候生效
        //所以多次配置只有第一次的配置会生效
        //如果修改了配置,需要重启应用

        //测试默认设置
//        testDefault();

        //测试自定义设置
        testSelf();

        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                //获取端口
                Integer port = PortGenerator.getPort();
                logger.debug("获取到端口号: " + port);

                //归还端口号
                logger.debug("归还端口号: " + PortGenerator.returnPort(port));
            }).start();
        }
    }

    /**
     * 测试默认设置
     */
    private static void testDefault(){
        //默认配置可以什么都不操作,直接使用

        //默认的参数如下
        //默认开始端口号: 34567
        //默认端口号总数: 200
        //默认主机地址: 127.0.0.1
    }

    /**
     * 测试自定义设置
     */
    private static void testSelf(){
        //端口配置对象
        PortGenerator.Configuration configuration = new PortGenerator.Configuration();

        //下面的配置可以根据自己的需求来配置

        //设置主机地址
        configuration.setLocalHost("127.0.0.1");
        //设置开始端口号
        configuration.setPortStart(3306);
        //设置端口号总数
        configuration.setPortCount(2);

        //上面的设置就是使用了
        //192.168.2.31:3306
        //192.168.2.31:3307

        //使用上面的配置对象初始化端口生成器
        PortGenerator.init(configuration);
    }
}

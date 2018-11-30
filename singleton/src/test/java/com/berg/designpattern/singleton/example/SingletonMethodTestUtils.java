package com.berg.designpattern.singleton.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.function.Supplier;

/**
 * 单例模式测试工具类
 *
 * @author bo.he02@hand-china.com
 * @apiNote 2018/11/30
 */
@Component
public class SingletonMethodTestUtils {
    /**
     * 日志打印对象
     */
    private static Logger logger = LoggerFactory.getLogger(SingletonMethodTestUtils.class);

    /**
     * 测试单线程情况
     *
     * @param supplier 获取实例对象
     * @param <T>      实例的泛型
     */
    <T> void testSingleThread(Supplier<T> supplier) {
        //实例A
        T instanceA = supplier.get();
        //实例B
        T instanceB = supplier.get();

        //打印结果
        logger.debug("instanceA == instanceB: {}", instanceA == instanceB);
    }

    /**
     * c测试多线程情况
     *
     * @param count    线程数
     * @param supplier 获取实例对象
     * @param <T>      实例的泛型
     */
    <T> void testMutilThread(int count, Supplier<T> supplier) {
        //多线程处理
        for (int i = 0; i < count; i++) {
            //开启线程
            new Thread(() -> {
                //打印结果
                logger.debug("单例哈希： {}", supplier.get().hashCode());
            }).start();
        }
    }
}

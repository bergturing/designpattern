package com.berg.designpattern.singleton.example;

import com.berg.designpattern.singleton.SingletonApplicationTests;
import com.berg.designpattern.singleton.example.method7.Singleton7;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 单例模式测试：枚举方式的单例模式
 * 线程安全、序列化安全
 *
 * @author bo.he02@hand-china.com
 * @apiNote 2018/11/30
 */
public class SingletonMethod7Tests extends SingletonApplicationTests {
    /**
     * 日志打印对象
     */
    private static Logger logger = LoggerFactory.getLogger(SingletonMethod7Tests.class);

    /**
     * 测试执行前的方法
     */
    @Before
    public void before() {
        logger.debug("单例模式测试：枚举方式的单例模式");
        logger.debug("线程安全、序列化安全");
        logger.debug("开始测试...");
    }

    /**
     * 测试执行后的方法
     */
    @After
    public void after() {
        logger.debug("测试完成...");
    }

    /**
     * 测试单线程的情景
     */
    @Test
    public void testSingleThread() {
        logger.debug("单例对象 {}", Singleton7.INSTANCE);
    }

    /**
     * 多线程模式测试
     */
    @Test
    public void testMutilThread() {
        logger.debug("单例对象 {}", Singleton7.INSTANCE);
    }
}

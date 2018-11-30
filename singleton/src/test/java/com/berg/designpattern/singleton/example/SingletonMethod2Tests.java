package com.berg.designpattern.singleton.example;

import com.berg.designpattern.singleton.SingletonApplicationTests;
import com.berg.designpattern.singleton.example.method2.Singleton2;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 单例模式测试：懒汉式单例模式
 * 线程不安全、序列化不安全
 *
 * @author bo.he02@hand-china.com
 * @apiNote 2018/11/30
 */
public class SingletonMethod2Tests extends SingletonApplicationTests {
    /**
     * 日志打印对象
     */
    private static Logger logger = LoggerFactory.getLogger(SingletonMethod2Tests.class);

    /**
     * 单例模式测试工具类
     */
    @Autowired
    private SingletonMethodTestUtils singletonMethodTestUtils;

    /**
     * 测试执行前的方法
     */
    @Before
    public void before() {
        logger.debug("单例模式测试：懒汉式单例模式");
        logger.debug("线程不安全、序列化不安全");
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
        //单线程测试
        this.singletonMethodTestUtils.testSingleThread(Singleton2::of);
    }

    /**
     * 多线程模式测试
     */
    @Test
    public void testMutilThread() {
        //多线程测试
        this.singletonMethodTestUtils.testMutilThread(15, Singleton2::of);
    }
}

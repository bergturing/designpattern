package com.berg.designpattern.proxy.example;

import com.berg.designpattern.proxy.example.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * 代理主题角色
 *
 * @author bo.he02@hand-china.com
 * @apiNote 2018/11/29
 */
@Component
public class Proxy implements Subject {
    /**
     * 日志打印对象
     */
    private static Logger logger = LoggerFactory.getLogger(Proxy.class);

    /**
     * 具体主题角色
     */
    private Subject subject;

    /**
     * 设置具体主题角色
     *
     * @param subject 具体主题角色
     */
    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void doSomething() {
        //执行代理前的操作
        this.before();
        //执行当前的操作
        this.subject.doSomething();
        //执行代理后的操作
        this.after();
    }

    /**
     * 代理前的操作
     */
    private void before() {
        logger.debug("before...");
    }

    /**
     * 代理后的操作
     */
    private void after() {
        logger.debug("after...");
    }
}

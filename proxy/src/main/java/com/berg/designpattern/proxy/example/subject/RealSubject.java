package com.berg.designpattern.proxy.example.subject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * 具体主题角色
 *
 * @author bergturing@qq.com
 * @apiNote 2018/11/29
 */
@Component
public class RealSubject implements Subject {
    /**
     * 日志打印对象
     */
    private static Logger logger = LoggerFactory.getLogger(RealSubject.class);

    @Override
    public void doSomething() {
        logger.debug("do something");
    }
}

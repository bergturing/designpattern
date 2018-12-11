package com.berg.designpattern.factorymethod.example.impl;

import com.berg.designpattern.factorymethod.example.Dangerous;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 工厂方法创建的对象实现
 *
 * @author bo.he02@hand-china.com
 * @apiNote 2018/12/11
 */
public class FakeDangerous implements Dangerous {
    /**
     * 日志打印对象
     */
    private static Logger logger = LoggerFactory.getLogger(FakeDangerous.class);

    @Override
    public void show() {
        logger.debug("I'm FakeDangerous");
    }
}

package com.berg.designpattern.prototype.example;

import com.berg.designpattern.prototype.PrototypeApplicationTests;
import com.berg.designpattern.prototype.example.prototype.Prototype;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 测试原型模式
 *
 * @author bo.he02@hand-china.com
 * @apiNote 2018/11/29
 */
public class PrototypeTest extends PrototypeApplicationTests {
    /**
     * 日志打印对象
     */
    private static Logger logger = LoggerFactory.getLogger(PrototypeTest.class);

    /**
     * 客户端
     */
    @Autowired
    private Client client;

    /**
     * 原型A
     */
    @Autowired
    private Prototype prototypeA;

    /**
     * 原型B
     */
    @Autowired
    private Prototype prototypeB;

    @Test
    public void testProtoType() {
        //克隆原型A
        this.cloneObject(this.prototypeA, 10);
        //克隆原型B
        this.cloneObject(this.prototypeB, 20);
    }

    /**
     * 克隆
     *
     * @param prototype 原型对象
     * @param count     克隆的数量
     */
    private void cloneObject(Prototype prototype, int count) {
        //根据原型A克隆对象
        Prototype anotherPrototypeA = null;
        logger.debug("克隆原型：{}", prototype);

        for (int i = 0; i < count; i++) {
            anotherPrototypeA = this.client.clonePrototype(prototype);
            logger.debug("克隆出的原型 {}：{}", i, anotherPrototypeA);
            logger.debug("克隆的原型与原始原型比较：{}", prototype == anotherPrototypeA);
        }
    }
}

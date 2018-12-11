package com.berg.designpattern.factorymethod.example;

import com.berg.designpattern.factorymethod.FactorymethodApplicationTests;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 工厂方法测试类
 *
 * @author bo.he02@hand-china.com
 * @apiNote 2018/12/11
 */
public class FooTests extends FactorymethodApplicationTests {
    /**
     * 测试的Foo对象
     */
    @Autowired
    private Foo foo;

    /**
     * 测试执行
     */
    @Test
    public void testFoo() {
        this.foo.process();
    }
}

package com.berg.designpattern.factorymethod.example.impl;

import com.berg.designpattern.factorymethod.example.Dangerous;
import com.berg.designpattern.factorymethod.example.Foo;
import org.springframework.stereotype.Component;

/**
 * 测试Foo，Foo接口的实现
 *
 * @author bergturing@qq.com
 * @apiNote 2018/12/11
 */
@Component
public class TestFoo implements Foo {
    @Override
    public void process() {
        //创建Dangerous
        this.createDangerous().show();
    }

    @Override
    public Dangerous createDangerous() {
        return new FakeDangerous();
    }
}

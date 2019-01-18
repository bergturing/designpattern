package com.berg.designpattern.factorymethod.example;

/**
 * Foo接口，拥有工厂方法的接口
 *
 * @author bergturing@qq.com
 * @apiNote 2018/12/11
 */
public interface Foo {
    /**
     * 处理流程
     */
    void process();

    /**
     * 创建Dangerous对象
     *
     * @return  Dangerous对象
     */
    Dangerous createDangerous();
}

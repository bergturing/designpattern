package com.berg.designpattern.proxy.base;

/**
 * 具体主题角色
 */
public class RealSubject implements Subject{

    @Override
    public void doSomething() {

        System.out.println("do something");
    }
}

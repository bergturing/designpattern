package com.berg.designpattern.proxy.base;

/**
 * 代理主题角色
 */
public class Proxy implements Subject{

    private Subject subject;

    public Proxy(Subject subject){

        this.subject = subject;
    }

    @Override
    public void doSomething() {

        this.before();

        this.subject.doSomething();

        this.after();
    }

    private void before(){

        System.out.println("before...");
    }

    private void after(){

        System.out.println("after...");
    }
}

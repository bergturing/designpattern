package com.berg.designpattern.proxy.base;

/**
 * 客户端
 */
public class client {

    public static void main(String[] args) {

        Subject realSubject = new RealSubject();

        Subject proxy = new Proxy(realSubject);

        proxy.doSomething();
    }
}

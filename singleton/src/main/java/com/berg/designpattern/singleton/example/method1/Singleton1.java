package com.berg.designpattern.singleton.example.method1;

/**
 * 饿汉式单例模式
 * 线程安全、序列化不安全
 *
 * @author bergturing@qq.com
 * @apiNote 2018/11/9
 */
public class Singleton1 {

    private static Singleton1 instance = new Singleton1();

    private Singleton1() {
    }

    public static Singleton1 of() {
        return instance;
    }
}

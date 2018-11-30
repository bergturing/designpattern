package com.berg.designpattern.singleton.example.method2;

/**
 * 懒汉式的单例模式
 * 线程不安全、序列化不安全
 *
 * @author bo.he02@hand-china.com
 * @apiNote 2018/11/9
 */
public class Singleton2 {

    private static Singleton2 instance;

    private Singleton2() {
    }

    public static Singleton2 of() {
        if (null == instance) {
            instance = new Singleton2();
        }

        return instance;
    }
}

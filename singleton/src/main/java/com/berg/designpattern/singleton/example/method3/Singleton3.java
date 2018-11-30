package com.berg.designpattern.singleton.example.method3;

/**
 * 方法同步锁的单例模式
 * 线程安全、序列化不安全
 *
 * @author bo.he02@hand-china.com
 * @apiNote 2018/11/9
 */
public class Singleton3 {

    private static Singleton3 instance;

    private Singleton3() {
    }

    public static synchronized Singleton3 of() {
        if (null == instance) {
            instance = new Singleton3();
        }

        return instance;
    }
}

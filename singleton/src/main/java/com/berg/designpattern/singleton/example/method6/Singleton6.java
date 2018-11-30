package com.berg.designpattern.singleton.example.method6;

/**
 * 静态内部类单例模式
 * 线程安全、序列化不安全
 *
 * @author bo.he02@hand-china.com
 * @apiNote 2018/11/9
 */
public class Singleton6 {

    private static class SingletonHandler {
        private static final Singleton6 INSTANCE = new Singleton6();
    }

    private Singleton6() {
    }

    public static Singleton6 of() {
        return SingletonHandler.INSTANCE;
    }
}

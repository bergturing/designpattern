package com.berg.designpattern.singleton.method_5;

/**
 * 静态内部类单例模式
 *
 * @author bo.he02@hand-china.com
 * @apiNote 2018/11/9
 */
public class Singleton {

    private static class SingletonHandler {
        private static final Singleton INSTANCE = new Singleton();
    }

    private Singleton() {
    }

    public static Singleton of() {
        return SingletonHandler.INSTANCE;
    }
}

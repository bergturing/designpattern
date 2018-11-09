package com.berg.designpattern.singleton.method_1;

/**
 * 懒汉式的单例模式
 * 线程不安全
 *
 * @author bo.he02@hand-china.com
 * @apiNote 2018/11/9
 */
public class Singleton {

    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton of() {
        if (null == instance) {
            instance = new Singleton();
        }

        return instance;
    }
}

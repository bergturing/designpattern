package com.berg.designpattern.singleton.method_3;

/**
 * 饿汉式单例模式
 *
 * @author bo.he02@hand-china.com
 * @apiNote 2018/11/9
 */
public class Singleton {

    private static Singleton instance = new Singleton();

    private Singleton() {
    }

    public static Singleton of() {
        return instance;
    }
}

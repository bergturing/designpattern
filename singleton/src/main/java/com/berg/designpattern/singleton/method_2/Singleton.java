package com.berg.designpattern.singleton.method_2;

/**
 * 懒汉式的单例模式
 * 线程安全
 *
 * @author bo.he02@hand-china.com
 * @apiNote 2018/11/9
 */
public class Singleton {

    private static Singleton instance;

    private Singleton() {}

    private static synchronized Singleton of() {
        if(null == instance) {
            instance = new Singleton();
        }

        return instance;
    }
}

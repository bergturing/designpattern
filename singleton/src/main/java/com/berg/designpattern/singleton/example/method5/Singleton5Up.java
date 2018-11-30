package com.berg.designpattern.singleton.example.method5;

/**
 * 双重校验锁实现单例模式
 * 进阶版
 *
 * @author bo.he02@hand-china.com
 * @apiNote 2018/11/9
 */
public class Singleton5Up {

    private volatile static Singleton5Up instance;

    private Singleton5Up() {
    }

    public static Singleton5Up of() {
        if (null == instance) {
            synchronized (Singleton5Up.class) {
                if (null == instance) {
                    instance = new Singleton5Up();
                }
            }
        }

        return instance;
    }
}

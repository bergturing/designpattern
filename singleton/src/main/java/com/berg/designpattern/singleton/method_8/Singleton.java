package com.berg.designpattern.singleton.method_8;

/**
 * 双重校验锁实现单例模式
 * 进阶版
 *
 * @author bo.he02@hand-china.com
 * @apiNote 2018/11/9
 */
public class Singleton {

    private volatile static Singleton instance;

    private Singleton() {
    }

    public static Singleton of() {
        if (null == instance) {
            synchronized (Singleton.class) {
                if (null == instance) {
                    instance = new Singleton();
                }
            }
        }

        return instance;
    }
}

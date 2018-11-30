package com.berg.designpattern.singleton.example.method8;

import java.io.Serializable;

/**
 * 使用双重校验锁实现单例模式
 * 线程安全、序列化安全
 *
 * @author bo.he02@hand-china.com
 * @apiNote 2018/11/9
 */
public class Singleton8 implements Serializable {

    private volatile static Singleton8 instance = null;

    private Singleton8() {
    }

    public static Singleton8 of() {
        if (null == instance) {
            synchronized (Singleton8.class) {
                if (null == instance) {
                    instance = new Singleton8();
                }
            }
        }

        return instance;
    }

    private Object readResolve() {
        return instance;
    }
}

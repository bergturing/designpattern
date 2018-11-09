package com.berg.designpattern.singleton.method_10;

import java.io.Serializable;

/**
 * 使用双重校验锁实现单例模式
 * 解决序列化问题
 *
 * @author bo.he02@hand-china.com
 * @apiNote 2018/11/9
 */
public class Singleton implements Serializable {

    private volatile static Singleton instance = null;

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

    private Object readResolve() {
        return instance;
    }
}

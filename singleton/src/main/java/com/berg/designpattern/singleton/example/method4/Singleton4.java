package com.berg.designpattern.singleton.example.method4;

/**
 * 代码块锁实现单例模式
 * 线程不安全、序列化不安全
 *
 * @author bergturing@qq.com
 * @apiNote 2018/11/9
 */
public class Singleton4 {

    private static Singleton4 instance;

    private Singleton4() {
    }

    public static Singleton4 of() {
        if (null == instance) {
            synchronized (Singleton4.class) {
                instance = new Singleton4();
            }
        }

        return instance;
    }
}

package com.berg.designpattern.singleton.example.method5;

/**
 * 双重校验同步锁实现单例模式
 * 线程安全、序列化不安全
 *
 * @author bergturing@qq.com
 * @apiNote 2018/11/9
 */
public class Singleton5 {

    private static Singleton5 instance;

    private Singleton5() {
    }

    public static Singleton5 of() {
        if (null == instance) {
            synchronized (Singleton5.class) {
                if (null == instance) {
                    instance = new Singleton5();
                }
            }
        }

        return instance;
    }
}

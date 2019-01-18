package com.berg.designpattern.singleton.example.method9;

/**
 * 使用双重校验锁实现单例模式
 * 再次进阶版，final
 *
 * @author bergturing@qq.com
 * @apiNote 2018/11/9
 */
public class Singleton9 {
    private volatile static FinalWrapper<Singleton9> helperWrapper = null;

    private Singleton9() {}

    public static Singleton9 of() {
        FinalWrapper<Singleton9> wrapper = helperWrapper;

        if (null == wrapper) {
            synchronized (Singleton9.class) {
                if (null == helperWrapper) {
                    helperWrapper = new FinalWrapper<>(new Singleton9());
                }
            }
            wrapper = helperWrapper;
        }

        return wrapper.value;
    }
}

class FinalWrapper<T> {
    final T value;

    FinalWrapper(T value) {
        this.value = value;
    }
}

package com.berg.designpattern.singleton.method_9;

/**
 * 使用双重校验锁实现单例模式
 * 再次进阶版，final
 *
 * @author bo.he02@hand-china.com
 * @apiNote 2018/11/9
 */
public class Singleton {
    private volatile static FinalWrapper<Singleton> helperWrapper = null;

    private Singleton() {}

    public static Singleton getHelper() {
        FinalWrapper<Singleton> wrapper = helperWrapper;

        if (null == wrapper) {
            synchronized (Singleton.class) {
                if (null == helperWrapper) {
                    helperWrapper = new FinalWrapper<>(new Singleton());
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

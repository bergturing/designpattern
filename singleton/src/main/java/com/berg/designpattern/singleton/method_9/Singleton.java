package com.berg.designpattern.singleton.method_9;

/**
 * 使用双重校验锁实现单例模式
 * 再次进阶版，final
 *
 * @author bo.he02@hand-china.com
 * @apiNote 2018/11/9
 */
public class Singleton {
    private FinalWrapper<Singleton> helperWrapper = null;

    public Singleton getHelper() {
        FinalWrapper<Singleton> wrapper = helperWrapper;

        if (null == wrapper) {
            synchronized (this) {
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
    public final T value;

    public FinalWrapper(T value) {
        this.value = value;
    }
}

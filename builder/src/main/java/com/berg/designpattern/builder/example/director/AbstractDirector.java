package com.berg.designpattern.builder.example.director;

import com.berg.designpattern.builder.example.builder.Builder;

/**
 * 指导者接口的抽象实现
 *
 * @author bo.he02@hand-china.com
 * @apiNote 2018/11/28
 */
public abstract class AbstractDirector implements Director {
    /**
     * 构造器对象
     */
    private Builder builder;

    protected Builder getBuilder() {
        return this.builder;
    }

    @Override
    public void setBuilder(Builder builder) {
        this.builder = builder;
    }
}

package com.berg.designpattern.builder.example.builder;

import com.berg.designpattern.builder.example.product.Computer;

/**
 * 建造者的抽象实现
 *
 * @author bo.he02@hand-china.com
 * @apiNote 2018/11/30
 */
public abstract class AbstractBuilder implements Builder {
    /**
     * 计算机
     */
    private Computer computer;

    public AbstractBuilder(Computer computer) {
        this.computer = computer;
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}

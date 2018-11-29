package com.berg.designpattern.strategy.example.strategy;

/**
 * @author bo.he02@hand-china.com
 * @apiNote 2018/11/29
 */
public interface Strategy {
    /**
     * 计算
     *
     * @param numberA 数据A
     * @param numberB 数据B
     * @return 计算结果
     */
    double operate(double numberA, double numberB);
}

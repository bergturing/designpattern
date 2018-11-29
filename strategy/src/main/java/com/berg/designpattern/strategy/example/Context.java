package com.berg.designpattern.strategy.example;

import com.berg.designpattern.strategy.example.strategy.Strategy;

/**
 * @author bo.he02@hand-china.com
 * @apiNote 2018/11/29
 */
public class Context {

    /**
     * 策略
     */
    private Strategy strategy;

    /**
     * 设置策略
     *
     * @param strategy  设置的策略
     * @return  处理结果
     */
    public Context setStrategy(Strategy strategy) {
        this.strategy = strategy;

        return this;
    }

    /**
     * 计算
     *
     * @param numberA 数据A
     * @param numberB 数据B
     * @return 计算结果
     */
    double calculate(double numberA, double numberB) {
        double result = 0.0;
        System.out.println("开始执行...");
        System.out.println("numberA = " + numberA + "; numberB = " + numberB);

        result = this.strategy.operate(numberA, numberB);

        System.out.println("执行完成...");

        return result;
    }
}

package com.berg.designpattern.strategy.example;

import com.berg.designpattern.strategy.example.strategy.Strategy;
import org.springframework.stereotype.Component;

/**
 * 内容提供对象
 *
 * @author bergturing@qq.com
 * @apiNote 2018/11/29
 */
@Component
public class Context {

    /**
     * 策略
     */
    private Strategy strategy;

    /**
     * 设置策略
     *
     * @param strategy 设置的策略
     * @return 处理结果
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
        return this.strategy.operate(numberA, numberB);
    }
}

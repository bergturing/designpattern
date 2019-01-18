package com.berg.designpattern.strategy.example.strategy;

import org.springframework.stereotype.Component;

/**
 * 除法策略
 *
 * @author bergturing@qq.com
 * @apiNote 2018/11/29
 */
@Component
public class DivStrategy implements Strategy {
    @Override
    public double operate(double numberA, double numberB) {
        if (numberB == 0.0) {
            throw new IllegalArgumentException("div zero!");
        }
        return numberA / numberB;
    }
}

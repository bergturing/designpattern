package com.berg.designpattern.strategy.example.strategy;

import org.springframework.stereotype.Component;

/**
 * 加法策略
 *
 * @author bo.he02@hand-china.com
 * @apiNote 2018/11/29
 */
@Component
public class AddStrategy implements Strategy {
    @Override
    public double operate(double numberA, double numberB) {
        return numberA + numberB;
    }
}

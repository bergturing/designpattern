package com.berg.designpattern.strategy.example.strategy;

/**
 * @author bo.he02@hand-china.com
 * @apiNote 2018/11/29
 */
public class DivStrategy implements Strategy {
    @Override
    public double operate(double numberA, double numberB) {
        System.out.println("除法");

        if(numberB == 0.0) {
            throw new IllegalArgumentException("div zero!");
        }
        return numberA / numberB;
    }
}

package com.berg.designpattern.strategy.example.strategy;

/**
 * @author bo.he02@hand-china.com
 * @apiNote 2018/11/29
 */
public class SubStrategy implements Strategy {
    @Override
    public double operate(double numberA, double numberB) {
        System.out.println("减法");

        return numberA - numberB;
    }
}

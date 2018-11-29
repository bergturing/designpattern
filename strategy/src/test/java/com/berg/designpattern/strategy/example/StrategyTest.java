package com.berg.designpattern.strategy.example;

import com.berg.designpattern.strategy.StrategyApplicationTests;
import com.berg.designpattern.strategy.example.strategy.*;
import org.junit.Test;

/**
 * @author bo.he02@hand-china.com
 * @apiNote 2018/11/29
 */
public class StrategyTest extends StrategyApplicationTests {
    /**
     * 上下文
     */
    private Context context = new Context();

    @Test
    public void test() {
        //加法
        this.calculate(new AddStrategy(), 1.0, 1.0);
        //减法
        this.calculate(new SubStrategy(), 1.0, 2.0);
        //乘法
        this.calculate(new MulStrategy(), 2.0, 3.0);
        //除法
        this.calculate(new DivStrategy(), 2.9, 1.3);
    }

    /**
     * 计算
     *
     * @param strategy  策略
     * @param numberA   数据A
     * @param numberB   数据B
     */
    private void calculate(Strategy strategy, double numberA, double numberB) {
        //处理数据
        double result = this.context.setStrategy(strategy).calculate(numberA, numberB);
        System.out.println("result = " + result);
        System.out.println();
    }
}

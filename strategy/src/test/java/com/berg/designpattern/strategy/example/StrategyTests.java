package com.berg.designpattern.strategy.example;

import com.berg.designpattern.strategy.StrategyApplicationTests;
import com.berg.designpattern.strategy.example.strategy.Strategy;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 策略模式测试
 *
 * @author bo.he02@hand-china.com
 * @apiNote 2018/11/29
 */
public class StrategyTests extends StrategyApplicationTests {
    /**
     * 上下文
     */
    @Autowired
    private Context context;

    /**
     * 加法策略
     */
    @Autowired
    private Strategy addStrategy;

    /**
     * 减法策略
     */
    @Autowired
    private Strategy subStrategy;

    /**
     * 乘法策略
     */
    @Autowired
    private Strategy mulStrategy;

    /**
     * 除法策略
     */
    @Autowired
    private Strategy divStrategy;

    @Test
    public void testStrategy() {
        //加法
        this.calculate(this.addStrategy, 1.0, 1.0, 2.0);
        //减法
        this.calculate(this.subStrategy, 1.0, 2.0, -1.0);
        //乘法
        this.calculate(this.mulStrategy, 2.0, 3.0, 6.0);
        //除法
        this.calculate(this.divStrategy, 2.6, 1.3, 2.0);
    }

    /**
     * 计算
     *
     * @param strategy       策略
     * @param numberA        数据A
     * @param numberB        数据B
     * @param expectedResult 期望结果
     */
    private void calculate(Strategy strategy, double numberA, double numberB, double expectedResult) {
        //实际结果
        double actualResult = this.context.setStrategy(strategy).calculate(numberA, numberB);

        //断言结果
        Assert.assertEquals(expectedResult, actualResult, 1E-6);
    }
}

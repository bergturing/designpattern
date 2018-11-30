package com.berg.designpattern.strategy.action.batch;

import com.berg.designpattern.strategy.StrategyApplicationTests;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 批量工具测试
 *
 * @author bo.he02@hand-china.com
 * @apiNote 2018/11/30
 */
public class BatchUtilsTests extends StrategyApplicationTests {
    /**
     * 批处理工具
     */
    @Autowired
    private BatchUtils batchUtils;

    /**
     * 测试批处理工具
     */
    @Test
    public void testBatchUtils() {
        //随机数生成器
        Random random = new Random(System.currentTimeMillis());

        //随机生成100个1000以内integer数字
        List<Integer> integerList = Stream.iterate(random.nextInt(1000), i -> random.nextInt(1000))
                .limit(100)
                .collect(Collectors.toList());

        //期望结果
        int expectedResult = integerList.stream().reduce(0, (result, item) -> result + item);

        //对数据分批求和，并返回最后所有数据的和
        //每个批次处理10条数据
        int actualResult = batchUtils.batchOperate(integerList, 10,
                subList -> subList.stream().reduce(0, (result, item) -> result + item),
                (result, item) -> result + item);

        //断言
        Assert.assertEquals(expectedResult, actualResult);
    }
}

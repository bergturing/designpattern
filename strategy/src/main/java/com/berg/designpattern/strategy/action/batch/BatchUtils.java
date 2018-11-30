package com.berg.designpattern.strategy.action.batch;

import org.apache.commons.collections4.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Objects;
import java.util.function.BinaryOperator;
import java.util.function.Function;

/**
 * 策略模式实战
 * 批处理工具
 *
 * @author bo.he02@hand-china.com
 * @apiNote 2018/11/30
 */
public class BatchUtils {
    /**
     * 日志打印对象
     */
    private static Logger logger = LoggerFactory.getLogger(BatchUtils.class);

    /**
     * 默认批处理的条数
     */
    private static final int DEFAULT_BATCH_COUNT_1000 = 1000;

    /**
     * 按照 batchCount 数量分批处理数据
     *
     * @param batchDataList  批次数据
     * @param batchCount     每一批处理的数据量， 默认为 BATCH_MAX_COUNT
     * @param actionFunction 逻辑处理对象
     * @param resultFunction 结果处理对象，如果没有结果处理对象，则返回最后一个批次处理数据的结果
     * @param <T>            批次数据类型
     * @return 批量处理数据的结果
     */
    public <T, R> R batchOperate(List<T> batchDataList, int batchCount, Function<List<T>, R> actionFunction, BinaryOperator<R> resultFunction) {
        Objects.requireNonNull(actionFunction, "逻辑处理对象不能为空");
        Objects.requireNonNull(resultFunction, "结果处理对象不能为空");

        //处理数据的结果
        R result = null;

        //批次处理开始时间
        LocalDateTime start = LocalDateTime.now();
        logger.debug("当前批次开始处理... 开始时间 {}", start.format(DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss.SSS")));

        //判断数据是否存在
        if (CollectionUtils.isNotEmpty(batchDataList)) {
            //处理的数据的数量
            int size = batchDataList.size();
            //下标从
            int fromIndex = 0;
            //下标至
            int toIndex = 0;

            //每一个批次处理的数据量
            if (batchCount <= 0) {
                batchCount = DEFAULT_BATCH_COUNT_1000;
            }

            logger.debug("处理的数据的总数 {}， 每个批次处理的数据量 {}", size, batchCount);

            //分批次处理
            for (int i = 0, batch = (int) Math.ceil(size * 1.0 / batchCount); i < batch; i++) {
                fromIndex = i * batchCount;
                toIndex = (i + 1) * batchCount;
                if (toIndex > size) {
                    toIndex = size;
                }

                logger.debug("批次 {}, 下标从 {}， 下标至 {}", i, fromIndex, toIndex);

                //处理数据
                if (null == result) {
                    //直接获取批次的结果
                    result = actionFunction.apply(batchDataList.subList(fromIndex, toIndex));
                } else {
                    //对每次处理的结果进行处理
                    result = resultFunction.apply(result, actionFunction.apply(batchDataList.subList(fromIndex, toIndex)));
                }
            }
        }

        //结束时间
        LocalDateTime end = LocalDateTime.now();
        logger.debug("批次处理完成... 结束时间 {}, 耗时 {}秒", start.format(DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss.SSS")), Duration.between(start, end).toMillis() / 1000.0);

        //返回结果
        return result;
    }
}

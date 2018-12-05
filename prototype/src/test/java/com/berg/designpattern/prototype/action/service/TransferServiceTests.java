package com.berg.designpattern.prototype.action.service;

import com.berg.designpattern.prototype.PrototypeApplicationTests;
import com.berg.designpattern.prototype.action.dto.BusinessDto;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 转换服务测试
 *
 * @author bo.he02@hand-china.com
 * @apiNote 2018/12/5
 */
public class TransferServiceTests extends PrototypeApplicationTests {
    /**
     * 日志打印对象
     */
    private static Logger logger = LoggerFactory.getLogger(TransferServiceTests.class);

    /**
     * 转换服务对象
     */
    @Autowired
    private ITransferService transferService;

    @Test
    public void testTransfer() {
        //处理的数据的条数
        int count = 1000000;

        //直接创建对象
        this.testTransfer(count, false);

        //使用原型创建对象
        this.testTransfer(count, true);
    }

    /**
     * 通过原型生成
     */
    private void testTransfer(int count, boolean cloneFlag) {
        //开始时间
        LocalDateTime start = LocalDateTime.now();

        //业务数据对象原型
        final BusinessDto businessDtoPrototype = new BusinessDto();

        //生成业务数据对象
        List<BusinessDto> businessDtoList = Stream.iterate(1, index -> index + 1)
                .limit(count)
                .map(index -> (cloneFlag ? businessDtoPrototype.clone() : new BusinessDto())
                        //商品名称
                        .setName("好又好凉鞋" + index)
                        //商品价格
                        .setPrice(BigDecimal.valueOf(index))
                        //商品数量
                        .setCount(BigDecimal.valueOf(index))).collect(Collectors.toList());

        //转换获取财务对象
        this.transferService.transfer(businessDtoList, cloneFlag);

        //结束时间
        LocalDateTime end = LocalDateTime.now();

        //打印结果
        logger.debug("count: {}, cloneFlag: {}, cost: {} s", count, cloneFlag, Duration.between(start, end).toMillis() / 1000.0);
    }
}

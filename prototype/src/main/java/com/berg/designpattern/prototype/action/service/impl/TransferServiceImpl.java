package com.berg.designpattern.prototype.action.service.impl;

import com.berg.designpattern.prototype.action.dto.BusinessDto;
import com.berg.designpattern.prototype.action.dto.FinanceDto;
import com.berg.designpattern.prototype.action.service.ITransferService;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 转换服务实现
 *
 * @author bergturing@qq.com
 * @apiNote 2018/12/5
 */
@Service
public class TransferServiceImpl implements ITransferService {
    /**
     * 并行流处理的数据量
     */
    private static final int PARALLEL_STREAM_COUNT = 1000;

    @Override
    public List<FinanceDto> transfer(List<BusinessDto> businessDtoList, boolean cloneFlag) {
        //判断是否有数据
        if (CollectionUtils.isNotEmpty(businessDtoList)) {
            //财务原型对象
            final FinanceDto financeDtoPrototype = new FinanceDto();

            //转换并返回结果
            return (businessDtoList.size() >= PARALLEL_STREAM_COUNT ? businessDtoList.parallelStream() : businessDtoList.stream())
                    .map(businessDto -> (cloneFlag ? financeDtoPrototype.clone() : new FinanceDto())
                            //商品名称
                            .setName(businessDto.getName())
                            //商品总价
                            .setAmount(businessDto.getPrice().multiply(businessDto.getCount()))).collect(Collectors.toList());
        }

        //数据为空就返回空对象
        return Collections.emptyList();
    }
}

package com.berg.designpattern.prototype.action.service;

import com.berg.designpattern.prototype.action.dto.BusinessDto;
import com.berg.designpattern.prototype.action.dto.FinanceDto;

import java.util.List;

/**
 * 转换服务接口
 *
 * @author bergturing@qq.com
 * @apiNote 2018/12/5
 */
public interface ITransferService {
    /**
     * 将业务数据对象转换成财务数据对象(通过克隆的方式)
     *
     * @param businessDtoList 业务数据对象
     * @param cloneFlag       是否使用克隆生成对象表标识
     * @return 财务数据对象
     */
    List<FinanceDto> transfer(List<BusinessDto> businessDtoList, boolean cloneFlag);
}

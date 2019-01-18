package com.berg.designpattern.builder.action.service;

import com.berg.designpattern.builder.action.condition.QueryCondition;
import com.berg.designpattern.builder.action.dto.Employee;

import java.util.List;

/**
 * 员工服务的接口
 *
 * @author bergturing@qq.com
 * @apiNote 2018/12/10
 */
public interface IEmployeeService {
    /**
     * 查询员工对象
     *
     * @param condition 查询条件对象
     * @return 查询结果
     */
    List<Employee> queryEmployee(QueryCondition condition);
}

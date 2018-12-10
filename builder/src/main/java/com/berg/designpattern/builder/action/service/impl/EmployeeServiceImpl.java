package com.berg.designpattern.builder.action.service.impl;

import com.berg.designpattern.builder.action.condition.QueryCondition;
import com.berg.designpattern.builder.action.dto.Employee;
import com.berg.designpattern.builder.action.service.IEmployeeService;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

/**
 * 员工服务的实现
 *
 * @author bo.he02@hand-china.com
 * @apiNote 2018/12/10
 */
@Service
public class EmployeeServiceImpl implements IEmployeeService {
    @Override
    public List<Employee> queryEmployee(QueryCondition condition) {
        return Collections.emptyList();
    }
}

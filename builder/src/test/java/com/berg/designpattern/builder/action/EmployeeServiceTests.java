package com.berg.designpattern.builder.action;

import com.berg.designpattern.builder.BuilderApplicationTests;
import com.berg.designpattern.builder.action.condition.QueryCondition;
import com.berg.designpattern.builder.action.dto.Employee;
import com.berg.designpattern.builder.action.service.IEmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

/**
 * 员工服务测试类
 *
 * @author bo.he02@hand-china.com
 * @apiNote 2018/12/10
 */
public class EmployeeServiceTests extends BuilderApplicationTests {
    /**
     * 日志打印对象
     */
    private static Logger logger = LoggerFactory.getLogger(EmployeeServiceTests.class);

    /**
     * 员工服务对象
     */
    @Autowired
    private IEmployeeService employeeService;

    public void testQuery() {
        //查询数据
        List<Employee> employeeList = employeeService.queryEmployee(QueryCondition.Builder.of("技术部")
                .setAge(12)
                .setWorkingDateFrom(new Date())
                .setPhoneNumber("152362")
                .built());

        logger.debug(String.valueOf(employeeList));
    }
}

package com.berg.designpattern.builder.action.condition;

import java.util.Date;

/**
 * 查询条件对象
 *
 * @author bo.he02@hand-china.com
 * @apiNote 2018/12/10
 */
public class QueryCondition {
    /**
     * 姓名
     */
    private String name;

    /**
     * 员工编号
     */
    private String employeeId;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 电话号码
     */
    private String phoneNumber;

    /**
     * 部门
     */
    private String department;

    /**
     * 工作日期从
     */
    private Date workingDateFrom;

    /**
     * 工作日期至
     */
    private Date workingDateTo;

    /**
     * 私有的构造方法
     */
    private QueryCondition(Builder builder) {
        //姓名
        this.name = builder.name;
        //员工编号
        this.employeeId = builder.employeeId;
        //年龄
        this.age = builder.age;
        //电话号码
        this.phoneNumber = builder.phoneNumber;
        //部门
        this.department = builder.department;
        //工作日期从
        this.workingDateFrom = builder.workingDateFrom;
        //工作日期至
        this.workingDateTo = builder.workingDateTo;
    }

    public String getName() {
        return name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public Integer getAge() {
        return age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getDepartment() {
        return department;
    }

    public Date getWorkingDateFrom() {
        return workingDateFrom;
    }

    public Date getWorkingDateTo() {
        return workingDateTo;
    }

    /**
     * 建造者对象
     */
    public static class Builder {
        /**
         * 姓名
         */
        private String name;

        /**
         * 员工编号
         */
        private String employeeId;

        /**
         * 年龄
         */
        private Integer age;

        /**
         * 电话号码
         */
        private String phoneNumber;

        /**
         * 部门
         */
        private final String department;

        /**
         * 工作日期从
         */
        private Date workingDateFrom;

        /**
         * 工作日期至
         */
        private Date workingDateTo;

        /**
         * 私有的构造方法
         *
         * @param department 部门
         */
        private Builder(String department) {
            //部门
            this.department = department;
        }

        /**
         * 工厂方法
         *
         * @param department 部门
         * @return 建造者对象
         */
        public static Builder of(String department) {
            return new Builder(department);
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setEmployeeId(String employeeId) {
            this.employeeId = employeeId;
            return this;
        }

        public Builder setAge(Integer age) {
            this.age = age;
            return this;
        }

        public Builder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder setWorkingDateFrom(Date workingDateFrom) {
            this.workingDateFrom = workingDateFrom;
            return this;
        }

        public Builder setWorkingDateTo(Date workingDateTo) {
            this.workingDateTo = workingDateTo;
            return this;
        }

        /**
         * 构建查询对象
         *
         * @return 查询对象
         */
        public QueryCondition built() {
            return new QueryCondition(this);
        }
    }
}

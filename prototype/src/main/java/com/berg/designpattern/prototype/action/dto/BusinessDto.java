package com.berg.designpattern.prototype.action.dto;

import java.math.BigDecimal;

/**
 * 业务数据
 *
 * @author bo.he02@hand-china.com
 * @apiNote 2018/12/5
 */
public class BusinessDto implements Cloneable {
    /**
     * 商品名称
     */
    private String name;

    /**
     * 价格
     */
    private BigDecimal price;

    /**
     * 数量
     */
    private BigDecimal count;

    public String getName() {
        return name;
    }

    public BusinessDto setName(String name) {
        this.name = name;
        return this;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public BusinessDto setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

    public BigDecimal getCount() {
        return count;
    }

    public BusinessDto setCount(BigDecimal count) {
        this.count = count;
        return this;
    }

    @Override
    public BusinessDto clone() {
        //克隆的业务对象
        BusinessDto businessDto = null;
        try {
            //克隆
            businessDto = (BusinessDto) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            throw new RuntimeException("clone error");
        }

        //返回克隆对象
        return businessDto;
    }
}

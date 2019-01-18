package com.berg.designpattern.prototype.action.dto;

import java.math.BigDecimal;

/**
 * 财务数据
 *
 * @author bergturing@qq.com
 * @apiNote 2018/12/5
 */
public class FinanceDto implements Cloneable {
    /**
     * 商品名称
     */
    private String name;

    /**
     * 总价
     */
    private BigDecimal amount;

    public String getName() {
        return name;
    }

    public FinanceDto setName(String name) {
        this.name = name;
        return this;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public FinanceDto setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    @Override
    public FinanceDto clone() {
        //克隆的财务对象
        FinanceDto financeDto = null;
        try {
            //克隆
            financeDto = (FinanceDto) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            throw new RuntimeException("clone error");
        }

        //返回克隆对象
        return financeDto;
    }
}

package com.berg.designpattern.builder.example.builder;

import com.berg.designpattern.builder.example.product.Computer;

/**
 * 建造者的接口
 *
 * @author bo.he02@hand-china.com
 * @apiNote 2018/11/28
 */
public interface Builder {
    /**
     * 创建cpu
     */
    void builtCpu();

    /**
     * 创建硬盘
     */
    void builtHardDisk();

    /**
     * 创建跑马灯
     */
    void builtMarquee();

    /**
     * 创建主板
     */
    void builtMotherboard();

    /**
     * 获取生成的computer
     *
     * @return 生成的计算机
     */
    Computer getComputer();
}

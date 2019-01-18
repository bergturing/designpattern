package com.berg.designpattern.builder.example.builder;

import com.berg.designpattern.builder.example.product.Computer;
import com.berg.designpattern.builder.example.widget.Cpu;
import com.berg.designpattern.builder.example.widget.HardDisk;
import com.berg.designpattern.builder.example.widget.Marquee;
import com.berg.designpattern.builder.example.widget.Motherboard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Mac计算机构造器
 *
 * @author bergturing@qq.com
 * @apiNote 2018/11/28
 */
@Component
public class MacBuilder extends AbstractBuilder {
    /**
     * mac的cpu
     */
    private final Cpu macCpu;

    /**
     * mac的硬盘
     */
    private final HardDisk macHardDisk;

    /**
     * mac的跑马灯
     */
    private final Marquee macMarquee;

    /**
     * mac的主板
     */
    private final Motherboard macMotherboard;

    @Autowired
    public MacBuilder(Computer computer, Cpu macCpu, HardDisk macHardDisk, Marquee macMarquee, Motherboard macMotherboard) {
        super(computer);
        this.macCpu = macCpu;
        this.macHardDisk = macHardDisk;
        this.macMarquee = macMarquee;
        this.macMotherboard = macMotherboard;
    }

    @Override
    public void builtCpu() {
        this.getComputer().setCpu(this.macCpu);
    }

    @Override
    public void builtHardDisk() {
        this.getComputer().setHardDisk(this.macHardDisk);
    }

    @Override
    public void builtMarquee() {
        this.getComputer().setMarquee(this.macMarquee);
    }

    @Override
    public void builtMotherboard() {
        this.getComputer().setMotherboard(this.macMotherboard);
    }
}

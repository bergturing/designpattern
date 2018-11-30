package com.berg.designpattern.builder.example.builder;

import com.berg.designpattern.builder.example.product.Computer;
import com.berg.designpattern.builder.example.widget.Cpu;
import com.berg.designpattern.builder.example.widget.HardDisk;
import com.berg.designpattern.builder.example.widget.Marquee;
import com.berg.designpattern.builder.example.widget.Motherboard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * MacPro的建造者
 *
 * @author bo.he02@hand-china.com
 * @apiNote 2018/11/28
 */
@Component
public class MacProBuilder extends AbstractBuilder {
    /**
     * macPro的cpu
     */
    private final Cpu macProCpu;

    /**
     * macPro的硬盘
     */
    private final HardDisk macProHardDisk;

    /**
     * macPro的跑马灯
     */
    private final Marquee macProMarquee;

    /**
     * macPro的主板
     */
    private final Motherboard macProMotherboard;

    @Autowired
    public MacProBuilder(Computer computer, Cpu macProCpu, HardDisk macProHardDisk, Marquee macProMarquee, Motherboard macProMotherboard) {
        super(computer);
        this.macProCpu = macProCpu;
        this.macProHardDisk = macProHardDisk;
        this.macProMarquee = macProMarquee;
        this.macProMotherboard = macProMotherboard;
    }


    @Override
    public void builtCpu() {
        this.getComputer().setCpu(this.macProCpu);
    }

    @Override
    public void builtHardDisk() {
        this.getComputer().setHardDisk(this.macProHardDisk);
    }

    @Override
    public void builtMarquee() {
        this.getComputer().setMarquee(this.macProMarquee);
    }

    @Override
    public void builtMotherboard() {
        this.getComputer().setMotherboard(this.macProMotherboard);
    }
}

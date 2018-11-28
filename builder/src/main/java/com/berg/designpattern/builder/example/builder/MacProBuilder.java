package com.berg.designpattern.builder.example.builder;

import com.berg.designpattern.builder.example.product.Computer;
import com.berg.designpattern.builder.example.widget.Cpu;
import com.berg.designpattern.builder.example.widget.HardDisk;
import com.berg.designpattern.builder.example.widget.Marquee;
import com.berg.designpattern.builder.example.widget.Motherboard;
import com.berg.designpattern.builder.example.widget.macpro.MacProCpu;
import com.berg.designpattern.builder.example.widget.macpro.MacProHardDisk;
import com.berg.designpattern.builder.example.widget.macpro.MacProMarquee;
import com.berg.designpattern.builder.example.widget.macpro.MacProMotherboard;

/**
 * @author bo.he02@hand-china.com
 * @apiNote 2018/11/28
 */
public class MacProBuilder implements Builder {

    /**
     * MacPro计算机
     */
    private Computer macPro = new Computer();

    @Override
    public void builtCpu() {
        this.macPro.setCpu(new MacProCpu());
    }

    @Override
    public void builtHardDisk() {
        this.macPro.setHardDisk(new MacProHardDisk());
    }

    @Override
    public void builtMarquee() {
        this.macPro.setMarquee(new MacProMarquee());
    }

    @Override
    public void builtMotherboard() {
        this.macPro.setMotherboard(new MacProMotherboard());
    }

    @Override
    public Computer getComputer() {
        return this.macPro;
    }
}

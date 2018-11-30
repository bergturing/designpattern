package com.berg.designpattern.builder.example.product;

import com.berg.designpattern.builder.example.widget.Cpu;
import com.berg.designpattern.builder.example.widget.HardDisk;
import com.berg.designpattern.builder.example.widget.Marquee;
import com.berg.designpattern.builder.example.widget.Motherboard;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * 计算机
 *
 * @author bo.he02@hand-china.com
 * @apiNote 2018/11/28
 */
@Component
@Scope("prototype")
public class Computer {
    /**
     * cpu
     */
    private Cpu cpu;

    /**
     * 硬盘
     */
    private HardDisk hardDisk;

    /**
     * 主板
     */
    private Motherboard motherboard;

    /**
     * 跑马灯
     */
    private Marquee marquee;

    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public HardDisk getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(HardDisk hardDisk) {
        this.hardDisk = hardDisk;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
    }

    public Marquee getMarquee() {
        return marquee;
    }

    public void setMarquee(Marquee marquee) {
        this.marquee = marquee;
    }

    public void show() {
        if (this.cpu != null) {
            this.cpu.run();
        }

        if (this.hardDisk != null) {
            this.hardDisk.rotate();
        }

        if (this.motherboard != null) {
            this.motherboard.show();
        }

        if (this.marquee != null) {
            this.marquee.flicker();
        }
    }
}

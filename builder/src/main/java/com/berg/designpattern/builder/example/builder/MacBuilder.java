package com.berg.designpattern.builder.example.builder;

import com.berg.designpattern.builder.example.product.Computer;
import com.berg.designpattern.builder.example.widget.mac.MacCpu;
import com.berg.designpattern.builder.example.widget.mac.MacHardDisk;
import com.berg.designpattern.builder.example.widget.mac.MacMarquee;
import com.berg.designpattern.builder.example.widget.mac.MacMotherboard;

/**
 * @author bo.he02@hand-china.com
 * @apiNote 2018/11/28
 */
public class MacBuilder implements Builder {

    /**
     * Mac计算机
     */
    private Computer mac = new Computer();


    @Override
    public void builtCpu() {
        this.mac.setCpu(new MacCpu());
    }

    @Override
    public void builtHardDisk() {
        this.mac.setHardDisk(new MacHardDisk());
    }

    @Override
    public void builtMarquee() {
        this.mac.setMarquee(new MacMarquee());
    }

    @Override
    public void builtMotherboard() {
        this.mac.setMotherboard(new MacMotherboard());
    }

    @Override
    public Computer getComputer() {
        return this.mac;
    }
}

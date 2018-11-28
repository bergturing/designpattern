package com.berg.designpattern.builder.example.widget.mac;

import com.berg.designpattern.builder.example.widget.Cpu;

/**
 * @author bo.he02@hand-china.com
 * @apiNote 2018/11/28
 */
public class MacCpu implements Cpu {
    @Override
    public void run() {
        System.out.println("Mac 的cpu开始运行...");
    }
}

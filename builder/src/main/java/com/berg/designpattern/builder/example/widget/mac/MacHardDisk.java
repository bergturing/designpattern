package com.berg.designpattern.builder.example.widget.mac;

import com.berg.designpattern.builder.example.widget.HardDisk;

/**
 * @author bo.he02@hand-china.com
 * @apiNote 2018/11/28
 */
public class MacHardDisk implements HardDisk {
    @Override
    public void rotate() {
        System.out.println("Mac 的硬盘开始旋转...");
    }
}

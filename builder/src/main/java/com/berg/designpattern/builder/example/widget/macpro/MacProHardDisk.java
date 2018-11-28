package com.berg.designpattern.builder.example.widget.macpro;

import com.berg.designpattern.builder.example.widget.HardDisk;

/**
 * @author bo.he02@hand-china.com
 * @apiNote 2018/11/28
 */
public class MacProHardDisk implements HardDisk {
    @Override
    public void rotate() {
        System.out.println("Mac Pro 的硬盘开始旋转...");
    }
}

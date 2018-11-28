package com.berg.designpattern.builder.example.widget.mac;

import com.berg.designpattern.builder.example.widget.Motherboard;

/**
 * @author bo.he02@hand-china.com
 * @apiNote 2018/11/28
 */
public class MacMotherboard implements Motherboard {
    @Override
    public void show() {
        System.out.println("Mac 的主板好看吧...");
    }
}

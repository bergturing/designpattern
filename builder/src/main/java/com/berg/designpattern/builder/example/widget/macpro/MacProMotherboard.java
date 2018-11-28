package com.berg.designpattern.builder.example.widget.macpro;

import com.berg.designpattern.builder.example.widget.Motherboard;

/**
 * @author bo.he02@hand-china.com
 * @apiNote 2018/11/28
 */
public class MacProMotherboard implements Motherboard {
    @Override
    public void show() {
        System.out.println("Mac Pro 的主板好看吧...");
    }
}

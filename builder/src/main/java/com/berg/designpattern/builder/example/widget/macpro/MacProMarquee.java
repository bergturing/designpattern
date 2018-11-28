package com.berg.designpattern.builder.example.widget.macpro;

import com.berg.designpattern.builder.example.widget.Marquee;

/**
 * @author bo.he02@hand-china.com
 * @apiNote 2018/11/28
 */
public class MacProMarquee implements Marquee {
    @Override
    public void flicker() {
        System.out.println("Mac Pro 的跑马灯开始闪烁...");
    }
}

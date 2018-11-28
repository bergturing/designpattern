package com.berg.designpattern.builder.example.widget.mac;

import com.berg.designpattern.builder.example.widget.Marquee;

/**
 * @author bo.he02@hand-china.com
 * @apiNote 2018/11/28
 */
public class MacMarquee implements Marquee {
    @Override
    public void flicker() {
        System.out.println("Mac 的跑马灯开始闪烁...");
    }
}

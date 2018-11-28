package com.berg.designpattern.abstractfactory.example.widget.blue;

import com.berg.designpattern.abstractfactory.example.widget.Mouse;

/**
 * 蓝色鼠标
 *
 * @author bo.he02@hand-china.com
 * @apiNote 2018/11/28
 */
public class BlueMouse implements Mouse {
    @Override
    public void move() {
        System.out.println("移动蓝色的鼠标");
    }
}

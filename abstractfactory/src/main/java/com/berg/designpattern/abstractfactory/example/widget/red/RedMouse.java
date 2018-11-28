package com.berg.designpattern.abstractfactory.example.widget.red;

import com.berg.designpattern.abstractfactory.example.widget.Mouse;

/**
 * 红色鼠标
 *
 * @author bo.he02@hand-china.com
 * @apiNote 2018/11/28
 */
public class RedMouse implements Mouse {
    @Override
    public void move() {
        System.out.println("移动红色的鼠标");
    }
}

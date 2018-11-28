package com.berg.designpattern.abstractfactory.example.widget.blue;

import com.berg.designpattern.abstractfactory.example.widget.Form;

/**
 * 蓝色窗体
 *
 * @author bo.he02@hand-china.com
 * @apiNote 2018/11/28
 */
public class BlueForm implements Form {
    @Override
    public void show() {
        System.out.println("展示蓝色的窗体");
    }
}

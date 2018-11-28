package com.berg.designpattern.abstractfactory.example.widget.red;

import com.berg.designpattern.abstractfactory.example.widget.Form;

/**
 * 红色窗体
 *
 * @author bo.he02@hand-china.com
 * @apiNote 2018/11/28
 */
public class RedForm implements Form {
    @Override
    public void show() {
        System.out.println("展示红色的窗体");
    }
}

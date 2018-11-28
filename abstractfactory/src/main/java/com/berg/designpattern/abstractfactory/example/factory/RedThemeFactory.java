package com.berg.designpattern.abstractfactory.example.factory;

import com.berg.designpattern.abstractfactory.example.widget.Form;
import com.berg.designpattern.abstractfactory.example.widget.Mouse;
import com.berg.designpattern.abstractfactory.example.widget.red.RedForm;
import com.berg.designpattern.abstractfactory.example.widget.red.RedMouse;

/**
 * 红色的主题
 *
 * @author bo.he02@hand-china.com
 * @apiNote 2018/11/28
 */
public class RedThemeFactory implements ThemeFactory {
    @Override
    public Form createForm() {
        return new RedForm();
    }

    @Override
    public Mouse createMouse() {
        return new RedMouse();
    }
}

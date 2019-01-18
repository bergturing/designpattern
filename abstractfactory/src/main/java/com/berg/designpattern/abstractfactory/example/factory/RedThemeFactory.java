package com.berg.designpattern.abstractfactory.example.factory;

import com.berg.designpattern.abstractfactory.example.widget.Form;
import com.berg.designpattern.abstractfactory.example.widget.Mouse;
import com.berg.designpattern.abstractfactory.example.widget.red.RedForm;
import com.berg.designpattern.abstractfactory.example.widget.red.RedMouse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 红色的主题
 *
 * @author bergturing@qq.com
 * @apiNote 2018/11/28
 */
@Component
public class RedThemeFactory implements ThemeFactory {
    /**
     * 红色的窗体
     */
    private Form redForm;

    /**
     * 红色的鼠标
     */
    private Mouse redMouse;

    @Autowired
    public RedThemeFactory(Form redForm, Mouse redMouse) {
        this.redForm = redForm;
        this.redMouse = redMouse;
    }

    @Override
    public Form createForm() {
        return this.redForm;
    }

    @Override
    public Mouse createMouse() {
        return this.redMouse;
    }
}

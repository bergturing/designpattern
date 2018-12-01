package com.berg.designpattern.abstractfactory.example.factory;

import com.berg.designpattern.abstractfactory.example.widget.Form;
import com.berg.designpattern.abstractfactory.example.widget.Mouse;
import com.berg.designpattern.abstractfactory.example.widget.blue.BlueForm;
import com.berg.designpattern.abstractfactory.example.widget.blue.BlueMouse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 蓝色的主题
 *
 * @author bo.he02@hand-china.com
 * @apiNote 2018/11/28
 */
@Component
public class BlueThemeFactory implements ThemeFactory {
    /**
     * 蓝色窗体
     */
    private final Form blueForm;

    /**
     * 蓝色鼠标
     */
    private final Mouse blueMouse;

    @Autowired
    public BlueThemeFactory(Form blueForm, Mouse blueMouse) {
        this.blueForm = blueForm;
        this.blueMouse = blueMouse;
    }

    @Override
    public Form createForm() {
        return this.blueForm;
    }

    @Override
    public Mouse createMouse() {
        return this.blueMouse;
    }
}

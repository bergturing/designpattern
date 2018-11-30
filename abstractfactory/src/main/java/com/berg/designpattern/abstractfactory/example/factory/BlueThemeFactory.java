package com.berg.designpattern.abstractfactory.example.factory;

import com.berg.designpattern.abstractfactory.example.widget.Form;
import com.berg.designpattern.abstractfactory.example.widget.Mouse;
import com.berg.designpattern.abstractfactory.example.widget.blue.BlueForm;
import com.berg.designpattern.abstractfactory.example.widget.blue.BlueMouse;
import org.springframework.stereotype.Component;

/**
 * 蓝色的主题
 *
 * @author bo.he02@hand-china.com
 * @apiNote 2018/11/28
 */
@Component
public class BlueThemeFactory implements ThemeFactory {
    @Override
    public Form createForm() {
        return new BlueForm();
    }

    @Override
    public Mouse createMouse() {
        return new BlueMouse();
    }
}

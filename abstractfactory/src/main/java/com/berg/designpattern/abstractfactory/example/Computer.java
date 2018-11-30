package com.berg.designpattern.abstractfactory.example;

import com.berg.designpattern.abstractfactory.example.factory.ThemeFactory;
import org.springframework.stereotype.Component;

/**
 * 计算机
 *
 * @author bo.he02@hand-china.com
 * @apiNote 2018/11/28
 */
@Component
public class Computer {
    /**
     * 主题工厂
     */
    private ThemeFactory themeFactory;

    public void setThemeFactory(ThemeFactory themeFactory) {
        this.themeFactory = themeFactory;
    }

    /**
     * 开机
     */
    public void open() {
        this.themeFactory.createForm().show();
        themeFactory.createMouse().move();
    }
}

package com.berg.designpattern.abstractfactory.example;

import com.berg.designpattern.abstractfactory.example.factory.ThemeFactory;
import org.springframework.stereotype.Component;

/**
 * 计算机
 *
 * @author bergturing@qq.com
 * @apiNote 2018/11/28
 */
@Component
public class Computer {
    /**
     * 主题工厂
     */
    private ThemeFactory themeFactory;

    public Computer setThemeFactory(ThemeFactory themeFactory) {
        this.themeFactory = themeFactory;

        return this;
    }

    /**
     * 开机
     */
    public void open() {
        this.themeFactory.createForm().show();
        themeFactory.createMouse().move();
    }
}

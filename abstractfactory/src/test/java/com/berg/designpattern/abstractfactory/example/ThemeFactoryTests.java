package com.berg.designpattern.abstractfactory.example;

import com.berg.designpattern.abstractfactory.AbstractfactoryApplicationTests;
import com.berg.designpattern.abstractfactory.example.factory.ThemeFactory;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 主题工厂测试
 *
 * @author bergturing@qq.com
 * @apiNote 2018/11/28
 */
public class ThemeFactoryTests extends AbstractfactoryApplicationTests {
    /**
     * 计算机
     */
    @Autowired
    private Computer computer;

    /**
     * 红色的主题工厂
     */
    @Autowired
    private ThemeFactory redThemeFactory;

    /**
     * 蓝色的主题工厂
     */
    @Autowired
    private ThemeFactory blueThemeFactory;

    @Test
    public void testThemeFactory() {
        //红色的主题
        this.computer.setThemeFactory(this.redThemeFactory).open();

        //蓝色主题
        this.computer.setThemeFactory(this.blueThemeFactory).open();
    }
}

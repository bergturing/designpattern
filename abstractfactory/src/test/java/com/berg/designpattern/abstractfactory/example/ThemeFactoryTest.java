package com.berg.designpattern.abstractfactory.example;

import com.berg.designpattern.abstractfactory.AbstractfactoryApplicationTests;
import com.berg.designpattern.abstractfactory.example.factory.BlueThemeFactory;
import com.berg.designpattern.abstractfactory.example.factory.RedThemeFactory;
import com.berg.designpattern.abstractfactory.example.factory.ThemeFactory;
import org.junit.Test;

/**
 * 测试主题工厂
 *
 * @author bo.he02@hand-china.com
 * @apiNote 2018/11/28
 */
public class ThemeFactoryTest extends AbstractfactoryApplicationTests {

    @Test
    public void test() {
        //主题工厂
        ThemeFactory themeFactory;
        Computer computer = new Computer();

        //红色的主题
        themeFactory = new RedThemeFactory();
        computer.setThemeFactory(themeFactory);
        computer.open();

        //蓝色主题
        themeFactory = new BlueThemeFactory();
        computer.setThemeFactory(themeFactory);
        computer.open();
    }
}

package com.berg.designpattern.abstractfactory.example.factory;

import com.berg.designpattern.abstractfactory.example.widget.Form;
import com.berg.designpattern.abstractfactory.example.widget.Mouse;

/**
 * 主题工厂
 *
 * @author bo.he02@hand-china.com
 * @apiNote 2018/11/28
 */
public interface ThemeFactory {
    /**
     * 创建窗体
     *
     * @return 窗体
     */
    Form createForm();

    /**
     * 创建鼠标
     *
     * @return 鼠标
     */
    Mouse createMouse();
}

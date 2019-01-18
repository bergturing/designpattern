package com.berg.designpattern.builder.example.widget.macpro;

import com.berg.designpattern.builder.example.widget.Motherboard;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * MacPro的主板
 *
 * @author bergturing@qq.com
 * @apiNote 2018/11/28
 */
@Component
public class MacProMotherboard implements Motherboard {
    /**
     * 日志打印对象
     */
    private static Logger logger = LoggerFactory.getLogger(MacProMotherboard.class);

    @Override
    public void show() {
        logger.debug("Mac Pro 的主板好看吧...");
    }
}

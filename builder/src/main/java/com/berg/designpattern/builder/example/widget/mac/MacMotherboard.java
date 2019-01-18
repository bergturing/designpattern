package com.berg.designpattern.builder.example.widget.mac;

import com.berg.designpattern.builder.example.widget.Motherboard;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Mac的主板
 *
 * @author bergturing@qq.com
 * @apiNote 2018/11/28
 */
@Component
public class MacMotherboard implements Motherboard {
    /**
     * 日志打印对象
     */
    private static Logger logger = LoggerFactory.getLogger(MacMotherboard.class);

    @Override
    public void show() {
        logger.debug("Mac 的主板好看吧...");
    }
}

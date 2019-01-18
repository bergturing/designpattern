package com.berg.designpattern.builder.example.widget.mac;

import com.berg.designpattern.builder.example.widget.HardDisk;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Mac的硬盘
 *
 * @author bergturing@qq.com
 * @apiNote 2018/11/28
 */
@Component
public class MacHardDisk implements HardDisk {
    /**
     * 日志打印对象
     */
    private static Logger logger = LoggerFactory.getLogger(MacHardDisk.class);

    @Override
    public void rotate() {
        logger.debug("Mac 的硬盘开始旋转...");
    }
}

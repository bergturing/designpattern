package com.berg.designpattern.builder.example.widget.macpro;

import com.berg.designpattern.builder.example.widget.HardDisk;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * MacPro的硬盘
 *
 * @author bergturing@qq.com
 * @apiNote 2018/11/28
 */
@Component
public class MacProHardDisk implements HardDisk {
    /**
     * 日志打印对象
     */
    private static Logger logger = LoggerFactory.getLogger(MacProHardDisk.class);

    @Override
    public void rotate() {
        logger.debug("Mac Pro 的硬盘开始旋转...");
    }
}

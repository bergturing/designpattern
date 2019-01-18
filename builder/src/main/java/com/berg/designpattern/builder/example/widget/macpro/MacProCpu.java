package com.berg.designpattern.builder.example.widget.macpro;

import com.berg.designpattern.builder.example.widget.Cpu;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * MacPro的cpu
 *
 * @author bergturing@qq.com
 * @apiNote 2018/11/28
 */
@Component
public class MacProCpu implements Cpu {
    /**
     * 日志打印对象
     */
    private static Logger logger = LoggerFactory.getLogger(MacProCpu.class);

    @Override
    public void run() {
        logger.debug("Mac Pro 的cpu开始运行...");
    }
}

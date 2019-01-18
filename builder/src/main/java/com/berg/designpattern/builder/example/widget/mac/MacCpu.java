package com.berg.designpattern.builder.example.widget.mac;

import com.berg.designpattern.builder.example.widget.Cpu;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Mac的cpu
 *
 * @author bergturing@qq.com
 * @apiNote 2018/11/28
 */
@Component
public class MacCpu implements Cpu {
    /**
     * 日志打印对象
     */
    private static Logger logger = LoggerFactory.getLogger(MacCpu.class);

    @Override
    public void run() {
        logger.debug("Mac 的cpu开始运行...");
    }
}

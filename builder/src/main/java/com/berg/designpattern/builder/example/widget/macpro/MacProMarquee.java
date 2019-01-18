package com.berg.designpattern.builder.example.widget.macpro;

import com.berg.designpattern.builder.example.widget.Marquee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * MacPro的跑马灯
 *
 * @author bergturing@qq.com
 * @apiNote 2018/11/28
 */
@Component
public class MacProMarquee implements Marquee {
    /**
     * 日志打印对象
     */
    private static Logger logger = LoggerFactory.getLogger(MacProMarquee.class);

    @Override
    public void flicker() {
        logger.debug("Mac Pro 的跑马灯开始闪烁...");
    }
}

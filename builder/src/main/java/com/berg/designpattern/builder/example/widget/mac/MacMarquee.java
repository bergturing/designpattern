package com.berg.designpattern.builder.example.widget.mac;

import com.berg.designpattern.builder.example.widget.Marquee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Mac的跑马灯
 *
 * @author bo.he02@hand-china.com
 * @apiNote 2018/11/28
 */
@Component
public class MacMarquee implements Marquee {
    /**
     * 日志打印对象
     */
    private static Logger logger = LoggerFactory.getLogger(MacMarquee.class);

    @Override
    public void flicker() {
        logger.debug("Mac 的跑马灯开始闪烁...");
    }
}

package com.berg.designpattern.abstractfactory.example.widget.red;

import com.berg.designpattern.abstractfactory.example.widget.Mouse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * 红色鼠标
 *
 * @author bergturing@qq.com
 * @apiNote 2018/11/28
 */
@Component
public class RedMouse implements Mouse {
    /**
     * 日志打印对象
     */
    private static Logger logger = LoggerFactory.getLogger(RedMouse.class);

    @Override
    public void move() {
        logger.debug("移动红色的鼠标");
    }
}

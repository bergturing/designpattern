package com.berg.designpattern.abstractfactory.example.widget.blue;

import com.berg.designpattern.abstractfactory.example.widget.Mouse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * 蓝色鼠标
 *
 * @author bo.he02@hand-china.com
 * @apiNote 2018/11/28
 */
@Component
public class BlueMouse implements Mouse {
    /**
     * 日志打印对象
     */
    private static Logger logger = LoggerFactory.getLogger(BlueMouse.class);

    @Override
    public void move() {
        logger.debug("移动蓝色的鼠标");
    }
}

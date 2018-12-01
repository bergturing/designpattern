package com.berg.designpattern.abstractfactory.example.widget.red;

import com.berg.designpattern.abstractfactory.example.widget.Form;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * 红色窗体
 *
 * @author bo.he02@hand-china.com
 * @apiNote 2018/11/28
 */
@Component
public class RedForm implements Form {
    /**
     * 日志打印对象
     */
    private static Logger logger = LoggerFactory.getLogger(RedForm.class);

    @Override
    public void show() {
        logger.debug("展示红色的窗体");
    }
}

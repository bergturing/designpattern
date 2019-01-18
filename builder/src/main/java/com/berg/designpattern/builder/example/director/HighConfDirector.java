package com.berg.designpattern.builder.example.director;

import org.springframework.stereotype.Component;

/**
 * 高配置的构造指导者
 *
 * @author bergturing@qq.com
 * @apiNote 2018/11/28
 */
@Component
public class HighConfDirector extends AbstractDirector {

    @Override
    public void construct() {
        this.getBuilder().builtCpu();
        this.getBuilder().builtHardDisk();
        this.getBuilder().builtMotherboard();

        //高配的就有跑马灯
        this.getBuilder().builtMarquee();
    }
}

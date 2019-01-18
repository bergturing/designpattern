package com.berg.designpattern.builder.example.director;

import org.springframework.stereotype.Component;

/**
 * 低配置的构造指导者
 *
 * @author bergturing@qq.com
 * @apiNote 2018/11/28
 */
@Component
public class LowConfDirector extends AbstractDirector {

    @Override
    public void construct() {
        this.getBuilder().builtCpu();
        this.getBuilder().builtHardDisk();
        this.getBuilder().builtMotherboard();

        //低配的没有跑马灯
//        this.getBuilder().builtMarquee();
    }
}

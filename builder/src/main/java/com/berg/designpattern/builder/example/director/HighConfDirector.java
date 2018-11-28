package com.berg.designpattern.builder.example.director;

import com.berg.designpattern.builder.example.builder.Builder;

/**
 * @author bo.he02@hand-china.com
 * @apiNote 2018/11/28
 */
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

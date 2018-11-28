package com.berg.designpattern.builder.example.director;

/**
 * @author bo.he02@hand-china.com
 * @apiNote 2018/11/28
 */
public class LowConfDirector extends AbstractDirector {

    @Override
    public void construct() {
        this.getBuilder().builtCpu();
        this.getBuilder().builtHardDisk();
        this.getBuilder().builtMotherboard();

        //高配的没有跑马灯
//        this.getBuilder().builtMarquee();
    }
}

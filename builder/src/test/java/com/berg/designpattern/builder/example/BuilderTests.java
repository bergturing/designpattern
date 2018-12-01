package com.berg.designpattern.builder.example;

import com.berg.designpattern.builder.BuilderApplicationTests;
import com.berg.designpattern.builder.example.builder.Builder;
import com.berg.designpattern.builder.example.director.Director;
import com.berg.designpattern.builder.example.product.Computer;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 建造者的测试
 *
 * @author bo.he02@hand-china.com
 * @apiNote 2018/11/28
 */
public class BuilderTests extends BuilderApplicationTests {
    /**
     * 日志打印对象
     */
    private static Logger logger = LoggerFactory.getLogger(BuilderTests.class);

    /**
     * 低配建造指导者
     */
    @Autowired
    private Director highConfDirector;

    /**
     * 高配建造指导者
     */
    @Autowired
    private Director lowConfDirector;

    /**
     * mac建造者
     */
    @Autowired
    private Builder macBuilder;

    /**
     * macPro建造者
     */
    @Autowired
    private Builder macProBuilder;

    @Test
    public void testBuilder() {
        //创建一个低配的mac
        logger.debug("创建一个低配的mac");
        this.show(this.lowConfDirector, this.macBuilder);

        //创建一个高配的mac
        logger.debug("创建一个高配的mac");
        this.show(this.highConfDirector, this.macBuilder);

        //创建一个高配的mac pro
        logger.debug("创建一个高配的mac pro");
        this.show(this.lowConfDirector, this.macProBuilder);

        //创建一个低配的mac pro
        logger.debug("创建一个低配的mac pro");
        this.show(this.highConfDirector, this.macProBuilder);
    }

    /**
     * 处理结果
     *
     * @param director 建造指导者
     * @param builder  建造者
     */
    private void show(Director director, Builder builder) {
        //设置构造器
        director.setBuilder(builder);

        //开始构造产品
        director.construct();
        //获得构造成功的产品
        Computer computer = builder.getComputer();

        //展示产品
        computer.show();
    }
}

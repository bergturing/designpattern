package com.berg.designpattern.builder.example;

import com.berg.designpattern.builder.BuilderApplicationTests;
import com.berg.designpattern.builder.example.builder.Builder;
import com.berg.designpattern.builder.example.builder.MacBuilder;
import com.berg.designpattern.builder.example.builder.MacProBuilder;
import com.berg.designpattern.builder.example.director.Director;
import com.berg.designpattern.builder.example.director.HighConfDirector;
import com.berg.designpattern.builder.example.director.LowConfDirector;
import com.berg.designpattern.builder.example.product.Computer;
import org.junit.Test;

/**
 * @author bo.he02@hand-china.com
 * @apiNote 2018/11/28
 */
public class BuilderTest extends BuilderApplicationTests {

    @Test
    public void test() {
        //创建一个低配的mac
        System.out.println("创建一个低配的mac");
        this.show(new LowConfDirector(), new MacBuilder());

        //创建一个高配的mac
        System.out.println("创建一个高配的mac");
        this.show(new HighConfDirector(), new MacBuilder());

        //创建一个高配的mac pro
        System.out.println("创建一个高配的mac pro");
        this.show(new HighConfDirector(), new MacProBuilder());

        //创建一个低配的mac pro
        System.out.println("创建一个低配的mac pro");
        this.show(new LowConfDirector(), new MacProBuilder());
    }

    private void show(Director director, Builder builder) {
        //设置构造器
        director.setBuilder(builder);

        //开始构造产品
        director.construct();
        //获得构造成功的产品
        Computer computer = builder.getComputer();

        //展示产品
        computer.show();
        System.out.println("");
    }
}

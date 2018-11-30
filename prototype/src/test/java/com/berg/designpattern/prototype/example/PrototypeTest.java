package com.berg.designpattern.prototype.example;

import com.berg.designpattern.prototype.PrototypeApplicationTests;
import com.berg.designpattern.prototype.example.prototype.Prototype;
import com.berg.designpattern.prototype.example.prototype.PrototypeA;
import com.berg.designpattern.prototype.example.prototype.PrototypeB;
import org.junit.Test;

/**
 * @author bo.he02@hand-china.com
 * @apiNote 2018/11/29
 */
public class PrototypeTest extends PrototypeApplicationTests {
    /**
     * 客户端
     */
    private Client client = new Client();

    @Test
    public void test() {
        //原型A
        Prototype prototypeA = new PrototypeA();
        //原型B
        Prototype prototypeB = new PrototypeB();

        //克隆原型A
        this.cloneObject(new PrototypeA(), 10);
        //克隆原型B
        this.cloneObject(new PrototypeB(), 20);
    }

    private void cloneObject(Prototype prototype, int count) {
        //根据原型A克隆对象
        Prototype anotherPrototypeA = null;
        System.out.println("克隆原型：" + prototype);

        for (int i = 0; i < count; i++) {
            anotherPrototypeA = this.client.clonePrototype(prototype);
            System.out.println(anotherPrototypeA);
            System.out.println(prototype == anotherPrototypeA);
        }

        System.out.println();
    }
}

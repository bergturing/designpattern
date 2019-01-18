package com.berg.designpattern.prototype.example.prototype;

import org.springframework.stereotype.Component;

/**
 * 原型B
 *
 * @author bergturing@qq.com
 * @apiNote 2018/11/29
 */
@Component
public class PrototypeB implements Prototype {
    @Override
    public Prototype clone() {
        Prototype prototype = null;

        try {
            prototype = (Prototype) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return prototype;
    }
}
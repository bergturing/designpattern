package com.berg.designpattern.prototype.example.prototype;

import org.springframework.stereotype.Component;

/**
 * 原型A
 *
 * @author bo.he02@hand-china.com
 * @apiNote 2018/11/29
 */
@Component
public class PrototypeA implements Prototype {
    @Override
    public Prototype clone() {
        Prototype prototype = null;

        try {
            prototype = (Prototype)super.clone();
        }catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return prototype;
    }
}

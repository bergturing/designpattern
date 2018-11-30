package com.berg.designpattern.prototype.example.prototype;

/**
 * @author bo.he02@hand-china.com
 * @apiNote 2018/11/29
 */
public class PrototypeB implements Prototype {
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
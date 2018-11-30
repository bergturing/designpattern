package com.berg.designpattern.prototype.example;

import com.berg.designpattern.prototype.example.prototype.Prototype;
import org.springframework.stereotype.Component;

/**
 * 客户端
 *
 * @author bo.he02@hand-china.com
 * @apiNote 2018/11/29
 */
@Component
public class Client {

    /**
     * 克隆prototype
     *
     * @param prototype 原型prototype
     * @return 克隆的prototype
     */
    Prototype clonePrototype(Prototype prototype) {
        return prototype.clone();
    }
}

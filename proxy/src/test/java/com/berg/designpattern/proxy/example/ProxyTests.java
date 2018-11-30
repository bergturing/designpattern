package com.berg.designpattern.proxy.example;

import com.berg.designpattern.proxy.ProxyApplicationTests;
import com.berg.designpattern.proxy.example.subject.Subject;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 代理模式测试
 *
 * @author bo.he02@hand-china.com
 * @apiNote 2018/11/30
 */
public class ProxyTests extends ProxyApplicationTests {
    /**
     * 代理主题角色
     */
    @Autowired
    private Proxy proxy;

    /**
     * 具体主题角色
     */
    @Autowired
    private Subject realSubject;

    @Test
    public void testProxy() {
        //设置代理的对象
        this.proxy.setSubject(this.realSubject);

        //执行代理方法
        this.proxy.doSomething();
    }
}

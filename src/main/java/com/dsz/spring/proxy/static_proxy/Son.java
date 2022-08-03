package com.dsz.spring.proxy.static_proxy;

/**
 * @Auther: ShouZhi@Duan
 * @Date: 2022/5/13 15:11
 * @Description:
 */
public class Son implements Person {

    @Override
    public void helloMyNameIs() {
        System.out.println("我是一个很帅气的男孩子！");
    }
}

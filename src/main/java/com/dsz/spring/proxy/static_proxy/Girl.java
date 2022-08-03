package com.dsz.spring.proxy.static_proxy;

/**
 * @Auther: ShouZhi@Duan
 * @Date: 2022/5/13 15:10
 * @Description:
 */
public class Girl implements Person {
    @Override
    public void helloMyNameIs() {
        System.out.println("我是一个很漂亮的女孩子！");
    }
}

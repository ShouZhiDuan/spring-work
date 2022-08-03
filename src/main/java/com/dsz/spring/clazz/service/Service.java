package com.dsz.spring.clazz.service;

/**
 * @Auther: ShouZhi@Duan
 * @Date: 2022/5/19 22:04
 * @Description:
 */
public class Service implements ServiceA,ServiceB {

    @Override
    public void test() {
        System.out.println(ServiceA.name);
        System.out.println(ServiceB.name);
    }

    @Override
    public void test(String txt) {

    }
}

package com.dsz.spring.clazz.service;

/**
 * @Auther: ShouZhi@Duan
 * @Date: 2022/5/19 22:01
 * @Description:
 */
public interface ServiceC extends ServiceA,ServiceB{
    String name = "qwerC";
    void test();
}

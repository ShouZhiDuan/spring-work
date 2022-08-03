package com.dsz.spring.proxy.static_proxy;

/**
 * @Auther: ShouZhi@Duan
 * @Date: 2022/5/14 13:01
 * @Description:
 */
public class TestMain {

    public static void main(String[] args) {
        Person girl= new Girl();
        Person son= new Son();

        Father father = new Father(girl);
        Father father1 = new Father(son);

        father.caiFang();
        father1.caiFang();
    }

}

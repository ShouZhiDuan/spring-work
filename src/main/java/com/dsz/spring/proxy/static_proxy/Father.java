package com.dsz.spring.proxy.static_proxy;

import lombok.Data;

/**
 * @Auther: ShouZhi@Duan
 * @Date: 2022/5/13 15:14
 * @Description:
 */
@Data
public class Father {

    private Person person;

    public Father(Person person) {
        this.person = person;
    }

    public void caiFang(){
        System.out.println("你好，请问你是谁？");
        person.helloMyNameIs();
        System.out.println("感谢你的回答，谢谢！");
    }

}

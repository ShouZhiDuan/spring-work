package com.dsz.spring.rmi;

/**
 * @Auther: ShouZhi@Duan
 * @Date: 2022/7/20 17:35
 * @Description:
 */
public class TestServiceImpl implements TestService {

    @Override
    public Object testRmiObj() {
        System.out.printf("==CALL SUCCESS==");
        return "OK";
    }
}

package com.dsz.spring.proxy.jdk.handler;

import com.dsz.spring.proxy.jdk.JdkProxyService;

/**
 * @Auther: ShouZhi@Duan
 * @Date: 2022/5/8 16:19
 * @Description:
 */
public class HandlerTestMain {
    public static void main(String[] args) {
        TestInvokeHandler testHandler = new TestInvokeHandler();
        JdkProxyService jdkProxyService = testHandler.clientProxy(JdkProxyService.class);
        jdkProxyService.helloJdkProxy("test 。。。");
    }
}

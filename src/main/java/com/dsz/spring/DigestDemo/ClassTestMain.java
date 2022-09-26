package com.dsz.spring.DigestDemo;

import java.security.ProtectionDomain;

/**
 * @Auther: ShouZhi@Duan
 * @Date: 2022/9/26 11:51
 * @Description:
 */
public class ClassTestMain {
    public static void main(String[] args) {
        ProtectionDomain protectionDomain = ClassTestMain.class.getProtectionDomain();
        System.out.println(protectionDomain);
    }
}
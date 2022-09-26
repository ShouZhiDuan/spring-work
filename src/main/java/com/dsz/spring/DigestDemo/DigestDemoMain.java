package com.dsz.spring.DigestDemo;

import org.springframework.util.DigestUtils;

/**
 * @Auther: ShouZhi@Duan
 * @Date: 2022/9/19 11:09
 * @Description:
 */
public class DigestDemoMain {
    public static void main(String[] args) {
        String txt = "index.php" + "filtertypepagedsizepage" + "filter" ;
        String s = DigestUtils.md5DigestAsHex(txt.getBytes());
        System.out.println(s);
    }
}

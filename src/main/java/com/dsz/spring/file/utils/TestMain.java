package com.dsz.spring.file.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @Auther: ShouZhi@Duan
 * @Date: 2022/9/9 12:41
 * @Description:
 */
public class TestMain {
    public static void main(String[] args) throws IOException {
        File file = new File("C:/Users/dev/Desktop/test.txt");
        FileInputStream inputStream = new FileInputStream(file);
        int len = 0;
        byte[] bytes = new byte[2];
        while ((len = inputStream.read(bytes)) != -1){
            for (byte aByte : bytes) {
                System.out.println(aByte);
            }
              System.out.println("======");
        }
    }
}

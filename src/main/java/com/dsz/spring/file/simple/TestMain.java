package com.dsz.spring.file.simple;

import java.io.*;

/**
 * @Auther: ShouZhi@Duan
 * @Date: 2022/5/18 15:21
 * @Description:
 */
public class TestMain {
    public static void main(String[] args) throws IOException {
        InputStream in = new FileInputStream("pkg/a.txt");
        OutputStream out = new FileOutputStream("pkg/b.txt");
        byte[] b = new byte[1024];
        int len = -1;
        while ((len = in.read(b, 0, b.length)) != -1) {
            String str = new String(b, 0, len, "UTF-8");
            System.out.println(str);
            out.write(b, 0, len);
        }
        out.close();
        in.close();
    }
}

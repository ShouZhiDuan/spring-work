package com.dsz.spring.file.simple;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

/**
 * @Auther: ShouZhi@Duan
 * @Date: 2022/8/3 13:50
 * @Description:
 */
public class FileInputstream {
    public static void main(String[] args) throws IOException {
//        ClassPathResource classPathResource = new ClassPathResource("test.txt");
//        InputStream inputStream = classPathResource.getInputStream();
//        byte[] bytes = new byte[1024];
//        while (inputStream.read(bytes) != -1){
//            System.out.println(bytes.toString());
//            System.out.println(new String(bytes, "UTF-8"));
//        }
        InputStream inputStream1 = new URL("https://p6-juejin.byteimg.com/tos-cn-i-k3u1fbpfcp/6add2d080cd2456a826bd1383d5e79d2~tplv-k3u1fbpfcp-zoom-in-crop-mark:3024:0:0:0.awebp").openStream();
        byte[] bytes = new byte[1024];
        while (inputStream1.read(bytes) != -1){
            System.out.println(bytes.toString());
            System.out.println(new String(bytes, "UTF-8"));
        }
    }
}

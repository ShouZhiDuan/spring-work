package com.dsz.spring;

import com.dsz.spring.config.MyConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.io.ClassPathResource;

import javax.imageio.stream.ImageInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class SpringWorkApplication {

    public static void main(String[] args) throws IOException {
        ConfigurableApplicationContext run = SpringApplication.run(SpringWorkApplication.class, args);
        MyConfig config = run.getBean(MyConfig.class);
        System.out.println(config.getName());
        //模拟多线程操作
//        int i = 0;
//        while (i < 100) {
//            i++;
//            new Thread(()->{
//                System.out.println(Thread.currentThread().getName());
//            }).start();
//        }
    }

}

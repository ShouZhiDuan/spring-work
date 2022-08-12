package com.dsz.spring;

import com.dsz.spring.code_test.FinalTest;
import com.dsz.spring.config.MyConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.util.ObjectUtils;

import java.io.IOException;

@Slf4j
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class SpringWorkApplication {

    public static void main(String[] args) throws IOException {
        ConfigurableApplicationContext run = SpringApplication.run(SpringWorkApplication.class, args);
        MyConfig config = run.getBean(MyConfig.class);
        System.out.println(config.getName());

        // TEST final params
        log.info("test final ......");
        //log.info("test static" + FinalTest.staticA);
        log.info("test static" + FinalTest.staticFinalA);
        ObjectUtils.isEmpty(null);
    }

}

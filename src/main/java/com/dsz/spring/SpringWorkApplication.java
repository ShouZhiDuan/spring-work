package com.dsz.spring;

import com.dsz.spring.config.MyConfig;
import io.lettuce.core.RedisClient;
import io.lettuce.core.RedisURI;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;

@Slf4j
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class SpringWorkApplication {

    @Value("${test.key}")
    private static String TEST_KEY;

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(SpringWorkApplication.class, args);
        MyConfig config = run.getBean(MyConfig.class);
        log.info(config.getName());
        log.info("${test.key}");
        String s = System.getenv().get("test.key");
        log.info("===结束===");
    }

}

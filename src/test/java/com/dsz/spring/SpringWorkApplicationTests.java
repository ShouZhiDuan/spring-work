package com.dsz.spring;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@SpringBootTest
class SpringWorkApplicationTests {

    @Autowired
    private StringRedisTemplate redisTemplate;

    @Test
    void contextLoads() {
        int a = 0;
        while (a <= 2){
            a++;
            redisTemplate.opsForList().leftPush("list_key",a + "_list_value");
        }
    }

    @Test
    void contextLoads2() {
        int a = 0;
        while (a <= 99){
            a++;
            String s = redisTemplate.opsForList().rightPop("list_key", 5, TimeUnit.SECONDS);
            System.out.println(s);
        }
    }

    @Test
    void contextLoads3() {
        int b = 0;
        while (b < 3){
            b++;
            new Thread(()->{
                int a = 0;
                while (a <= 10000){
                    a++;
                    redisTemplate.opsForValue().set("key_" + a, "value_" + a);
                    System.out.println(Thread.currentThread().getName() + "：key_" + a + " 设置成功！");
                }
            }).start();
        }

    }


    @Test
    void test3(){
        String s = redisTemplate.opsForList().rightPop("test_key", 5, TimeUnit.SECONDS);
        System.out.println(s.equals("null"));
    }


}

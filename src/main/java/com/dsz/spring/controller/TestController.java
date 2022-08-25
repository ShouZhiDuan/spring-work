package com.dsz.spring.controller;

import com.alibaba.fastjson.JSON;
import com.dsz.spring.bean_definition.Person;
import com.dsz.spring.dto.TestDTO;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * @Auther: ShouZhi@Duan
 * @Date: 2022/5/24 9:46
 * @Description:
 */
@CrossOrigin
@RestController
@RequestMapping("/test")
public class TestController {

//    @Autowired
//    private JdbcTemplate jdbcTemplate;

    @Autowired
    private GenericApplicationContext ctx;

    @Autowired
    private StringRedisTemplate redisTemplate;


    @PostMapping("/test")
    public TestDTO test1(@RequestBody TestDTO testDTO){
        return testDTO;
    }




    @GetMapping("/bean")
    public Object test(){
        MutablePropertyValues pvs = new MutablePropertyValues();
        pvs.add("name", "shouzhi");
        pvs.add("age", 33);
        RootBeanDefinition rootBeanDefinition = new RootBeanDefinition(Person.class, null, pvs);
        ctx.registerBeanDefinition("person",rootBeanDefinition);
        ctx.refresh();
        Person person = ctx.getBean(Person.class);
        return JSON.toJSONString(person);
    }

    @GetMapping("/1")
    public Object test1(@RequestParam(name = "name", defaultValue = "") Long id){
        return "OK";
    }

    @GetMapping("/redis")
    public void  redistest(int b){
        while (b < 1000){
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

}

package com.dsz.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: ShouZhi@Duan
 * @Date: 2022/5/24 9:46
 * @Description:
 */
@RestController
@RequestMapping("/test")
public class TestController {

//    @Autowired
//    private JdbcTemplate jdbcTemplate;

    @Autowired
    private StringRedisTemplate redisTemplate;

//    @GetMapping("/insert")
//    public Object test(){
//        List<Map<String, Object>> maps = jdbcTemplate.queryForList("select  * from  user");
//        return maps;
//    }

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

package com.dsz.spring.clazz.static_class;

import lombok.Data;

/**
 * @Auther: ShouZhi@Duan
 * @Date: 2022/5/14 13:05
 * @Description:
 */
@Data
public class StaticClass {

    @Data
    static class Test{
        private String name;
        private static Integer age;
    }

    @Data
    class NoStaticClas{
        private String name;
    }



}

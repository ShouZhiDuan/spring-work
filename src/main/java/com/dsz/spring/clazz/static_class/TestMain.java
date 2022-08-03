package com.dsz.spring.clazz.static_class;

/**
 * @Auther: ShouZhi@Duan
 * @Date: 2022/5/14 22:14
 * @Description:
 */
public class TestMain {
    public static void main(String[] args) {
        StaticClass staticClass = new StaticClass();
        StaticClass.NoStaticClas noStaticClas = staticClass.new NoStaticClas();
        StaticClass.Test test = new StaticClass.Test();
    }
}
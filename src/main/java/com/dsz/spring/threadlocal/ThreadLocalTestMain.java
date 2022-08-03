package com.dsz.spring.threadlocal;

/**
 * @Auther: ShouZhi@Duan
 * @Date: 2022/5/19 11:23
 * @Description:
 */
public class ThreadLocalTestMain {
    private final static ThreadLocal<String> THREAD_LOCAL = new ThreadLocal<>();

    public static void main(String[] args) {
        THREAD_LOCAL.set("666");
        System.out.println(THREAD_LOCAL.get());
        THREAD_LOCAL.remove();
    }
}

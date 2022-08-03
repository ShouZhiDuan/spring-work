package com.dsz.spring.refrence;

/**
 * @Auther: ShouZhi@Duan
 * @Date: 2022/5/27 17:39
 * @Description:
 */
public class TestMain {
    public static void main(String[] args) throws InterruptedException {
        CacheReference cacheReference = new CacheReference("888");
        System.gc();
        //Thread.sleep(3000);
        Object s = cacheReference.get();
        System.out.println(s);
    }

}

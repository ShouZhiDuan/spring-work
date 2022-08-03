package com.dsz.spring.refrence;

import java.lang.ref.WeakReference;

/**
 * @Auther: ShouZhi@Duan
 * @Date: 2022/5/27 17:37
 * @Description:
 */
public class CacheReference  extends WeakReference<Object> {

    public CacheReference(Object referent) {
        super(referent);
    }
}

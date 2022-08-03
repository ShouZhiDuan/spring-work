package com.dsz.spring.rmi;

import java.rmi.Remote;

/**
 * @Auther: ShouZhi@Duan
 * @Date: 2022/7/20 17:34
 * @Description: RMI
 */
public interface TestService extends Remote {
    Object testRmiObj();
}

package com.dsz.spring.rmi;

import java.io.IOException;
import java.rmi.AlreadyBoundException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/**
 * @Auther: ShouZhi@Duan
 * @Date: 2022/7/20 17:38
 * @Description:
 */
public class RMIServer {
    public static void main(String[] args) {

        TestService testService = new TestServiceImpl();
        try {
            TestService stub = (TestService) UnicastRemoteObject.exportObject(testService, 4000);
            Registry registry = LocateRegistry.getRegistry("127.0.0.1", 8000);
            registry.bind("hello", stub);
        } catch (AlreadyBoundException | IOException e) {
            e.printStackTrace();
        }

    }
}

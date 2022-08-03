package com.dsz.spring.rmi;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.concurrent.CountDownLatch;

/**
 * @Auther: ShouZhi@Duan
 * @Date: 2022/7/20 17:37
 * @Description:
 */
public class RegistryServer {
    public static void main(String[] args) throws InterruptedException{
        try {
            Registry registry = LocateRegistry.createRegistry(8000);
            //System.setProperty("java.security.policy", "AllPermission.policy");

//            String[] list = registry.list();
//
//            while (true){
//                for (String s : list) {
//                    System.out.println(s);
//                }
//            }


        } catch (RemoteException e) {
            e.printStackTrace();
        }
        CountDownLatch latch=new CountDownLatch(1);
        latch.await();
    }
}

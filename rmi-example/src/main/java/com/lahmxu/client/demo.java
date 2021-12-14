package com.lahmxu.client;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class demo {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("127.0.0.1", 1099);
            HelloService helloService = (HelloService) registry.lookup("hello");
            System.out.println(helloService.sayHello());
        } catch (NotBoundException | RemoteException e) {
            e.printStackTrace();
        }

    }
}

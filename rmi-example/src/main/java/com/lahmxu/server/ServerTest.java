package com.lahmxu.server;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ServerTest {
    public static void main(String[] args) throws Exception {
        Registry registry = LocateRegistry.createRegistry(1099);
        registry.bind("hello", new HelloServiceImpl());
        System.out.println("Server start...");
    }
}

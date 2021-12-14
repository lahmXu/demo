package com.lahmxu.server;

import com.lahmxu.client.HelloService;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * @author lahmxu
 */
public class HelloServiceImpl extends UnicastRemoteObject implements HelloService {

    protected HelloServiceImpl() throws RemoteException {
    }

    @Override
    public String sayHello() throws RemoteException {
        String result = "hello!";
        System.out.println("[HelloServiceImpl] return: " + result);
        return result;
    }
}

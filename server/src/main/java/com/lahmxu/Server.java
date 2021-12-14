package com.lahmxu;

import com.sun.jndi.rmi.registry.ReferenceWrapper;

import javax.naming.NamingException;
import javax.naming.Reference;
import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {

    public static void main(String[] args) throws Exception {
        LocateRegistry.createRegistry(1099);
        Registry registry = LocateRegistry.getRegistry();
        System.out.println("JNDI 注册成功");

        String className="com.lahmxu.OBJ";
        Reference reference = new Reference(className, className, null);
        ReferenceWrapper referenceWrapper = new ReferenceWrapper(reference);
        registry.bind("test",referenceWrapper);
        System.out.println("RMI 绑定");

    }
}

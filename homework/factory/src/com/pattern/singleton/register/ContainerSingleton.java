package com.pattern.singleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author kai on
 * @date 2019/3/11 22:15
 */
public class ContainerSingleton {

    private ContainerSingleton(){}

    private static Map<String,Object> ioc = new ConcurrentHashMap<String,Object>();

    public static Object getInstance(String className){
        synchronized (ioc){
            if(!ioc.containsKey(className)){
                Object object = null;
                try {
                    object = Class.forName(className);
                    ioc.put(className,object);
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
                return object;
            }else{
                return ioc.get(className);
            }
        }
    }


}

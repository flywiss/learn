package com.pattern.HungrySingleton;

/**
 * @author kai on
 * @date 2019/3/10 19:32
 */
public class HungrySingleton {

    private static HungrySingleton singleton = new HungrySingleton();
    private HungrySingleton(){ }
    public  static HungrySingleton getInstance(){
        return singleton;
    }

}

package com.pattern.singleton.lazy;

/**
 * @author kai on
 * @date 2019/3/11 14:09
 */
public class LazyDoubleCheckSingleton {

    //解决多线程下乱序的问题，防止将null对象赋值给引用
    private volatile static LazyDoubleCheckSingleton lazy = null;

    private LazyDoubleCheckSingleton(){};

    public static LazyDoubleCheckSingleton getInstance(){
        //提高多线程情况下的性能
        if(lazy == null){
            synchronized (LazyDoubleCheckSingleton.class){
                //判定是否已有线程赋值对象给引用
                if(lazy == null){
                    lazy = new LazyDoubleCheckSingleton();
                }
            }
        }
        return lazy;
    }

}

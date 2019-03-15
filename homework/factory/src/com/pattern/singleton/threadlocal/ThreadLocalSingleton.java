package com.pattern.singleton.threadlocal;

/**
 * @author kai on
 * @date 2019/3/11 22:29
 */
public class ThreadLocalSingleton {

    private static final ThreadLocal<ThreadLocalSingleton> threadLocalInstance = new ThreadLocal<ThreadLocalSingleton>(){

        @Override
        protected ThreadLocalSingleton initialValue() {
            return new ThreadLocalSingleton();
        }
    };

    private ThreadLocalSingleton (){}

    public static ThreadLocalSingleton getInstance(){
        return threadLocalInstance.get();
    }

}

package com.pattern.factory.SimpleFactory;

/**
 * @author kai on
 * @date 2019/3/9 22:55
 */
public class JavaCourse implements ICourse{
    @Override
    public void record() {
        System.out.println("正在录制java课程");
    }
}

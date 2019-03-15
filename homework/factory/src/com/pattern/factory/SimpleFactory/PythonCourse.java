package com.pattern.factory.SimpleFactory;

/**
 * @author kai on
 * @date 2019/3/9 22:56
 */
public class PythonCourse implements ICourse{
    @Override
    public void record() {
        System.out.println("正在录制Python课程");
    }
}

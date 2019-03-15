package com.pattern.factory.FactoryMethod;

import com.pattern.factory.SimpleFactory.ICourse;
import com.pattern.factory.SimpleFactory.JavaCourse;

/**
 * @author kai on
 * @date 2019/3/9 23:28
 */
public class JavaCourseFactory implements ICourseFactory {
    @Override
    public ICourse createCourse() {
        return new JavaCourse();
    }
}

package com.pattern.factory.FactoryMethod;

import com.pattern.factory.SimpleFactory.ICourse;
import com.pattern.factory.SimpleFactory.PythonCourse;

/**
 * @author kai on
 * @date 2019/3/10 14:50
 */
public class PythonCourseFactory implements ICourseFactory{
    @Override
    public ICourse createCourse() {
        return new PythonCourse();
    }
}

package com.pattern.factory.FactoryMethod;

import com.pattern.factory.SimpleFactory.ICourse;

/**
 * @author kai on
 * @date 2019/3/10 14:51
 */
public class FactoryMethodTest {

    public static void main(String[] args) {
        JavaCourseFactory javaCourseFactory = new JavaCourseFactory();
        ICourse course = javaCourseFactory.createCourse();
        course.record();
        PythonCourseFactory pythonCourseFactory = new PythonCourseFactory();
        ICourse course1 = pythonCourseFactory.createCourse();
        course1.record();
    }

}

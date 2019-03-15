package com.pattern.factory.SimpleFactory;

/**
 * @author kai on
 * @date 2019/3/9 23:00
 */
public class FactoryTest {

    public static void main(String[] args) {
        CourseFactory factory = new CourseFactory();
        ICourse java = factory.create("java");
        java.record();
        ICourse python = factory.create("python");
        python.record();

        ICourse course = CourseFactory2.create(JavaCourse.class);
        course.record();
        ICourse course1 = CourseFactory2.create(PythonCourse.class);
        course1.record();

    }

}

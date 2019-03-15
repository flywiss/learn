package com.pattern.factory.AbstractFactory;

/**
 * @author kai on
 * @date 2019/3/10 15:13
 */
public class AbstractFactoryTest {

    public static void main(String[] args) {
        JavaCourseFactory javaCourseFactory = new JavaCourseFactory();
        javaCourseFactory.createNote().edit();
        javaCourseFactory.createVideo().record();
    }

}

package com.pattern.factory.SimpleFactory;

/**
 * @author kai on
 * @date 2019/3/9 22:58
 */
public class CourseFactory {
    public ICourse create(String courseName){
        if("java".equals(courseName)){
            return new JavaCourse();
        }else if("python".equals(courseName)){
            return new PythonCourse();
        }else{
            return null;
        }
    }

}

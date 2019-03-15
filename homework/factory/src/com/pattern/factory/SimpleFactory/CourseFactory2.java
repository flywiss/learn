package com.pattern.factory.SimpleFactory;

/**
 * @author kai on
 * @date 2019/3/9 23:05
 */
public class CourseFactory2 {

    public static ICourse create(Class<? extends ICourse> clazz){
        try {
            if(null != clazz){
                return clazz.newInstance();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

}

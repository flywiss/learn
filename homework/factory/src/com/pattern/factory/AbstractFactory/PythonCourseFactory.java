package com.pattern.factory.AbstractFactory;

/**
 * @author kai on
 * @date 2019/3/10 15:11
 */
public class PythonCourseFactory implements ICourseFactory{
    @Override
    public INote createNote() {
        return new PythonNote();
    }

    @Override
    public IVideo createVideo() {
        return new PythonVideo();
    }
}

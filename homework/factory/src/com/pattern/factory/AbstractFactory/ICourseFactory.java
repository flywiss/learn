package com.pattern.factory.AbstractFactory;

/**
 * @author kai on
 * @date 2019/3/10 14:55
 */
public interface ICourseFactory {

        INote createNote();
        IVideo createVideo();

}

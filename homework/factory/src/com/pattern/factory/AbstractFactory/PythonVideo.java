package com.pattern.factory.AbstractFactory;

/**
 * @author kai on
 * @date 2019/3/10 15:08
 */
public class PythonVideo implements IVideo {
    @Override
    public void record() {
        System.out.println("录制python视频");
    }
}

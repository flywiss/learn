package com.pattern.factory.AbstractFactory;

/**
 * @author kai on
 * @date 2019/3/10 15:09
 */
public class JavaNote implements INote {
    @Override
    public void edit() {
        System.out.println("编写java笔记");
    }
}

package com.pattern.singleton.test;

import com.pattern.singleton.register.EnumSingleton;
import com.pattern.singleton.register.Student;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author kai on
 * @date 2019/3/11 16:21
 */
public class EnumSingletonTest {

    public static void main(String[] args) {
        try{
            EnumSingleton instance1 = null;
            EnumSingleton instance2 = EnumSingleton.getIsntance();
            instance2.setData(new Student());

            FileOutputStream fos = new FileOutputStream("EnumSingleton.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(instance2);
            oos.flush();
            oos.close();

            FileInputStream fis = new FileInputStream("EnumSingleton.obj");
            ObjectInputStream is = new ObjectInputStream(fis);
            instance1 = (EnumSingleton)is.readObject();
            is.close();

            System.out.println(instance1.getData());
            System.out.println(instance2.getData());
            System.out.println(instance1.getData() == instance2.getData());

        }catch (Exception e){
            e.printStackTrace();
        }


    }

}

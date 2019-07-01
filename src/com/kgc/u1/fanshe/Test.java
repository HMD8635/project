package com.kgc.u1.fanshe;

import com.kgc.u1.entity.Student;

import java.lang.reflect.Field;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {

        Field[] fields = Class.forName("com.kgc.u1.entity.Student").getDeclaredFields();

        Student instance=new Student();

        for (int a=0;a<fields.length;a++){
            fields[a].setAccessible(true);
            System.out.println("改值前:"+fields[a].getName()+":"+fields[a].get(instance));
            System.out.println(instance.toString());
            fields[a].set(instance,"李四");
            System.out.println("改值后:"+fields[a].getName()+":"+fields[a].get(instance));
            System.out.println(instance.toString());
        }

    }
}

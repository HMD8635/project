package com.kgc.u1.entity;

public class Student {
    private String name="张三";

    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return "我叫"+name;
    }
}

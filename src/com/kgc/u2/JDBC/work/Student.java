package com.kgc.u2.JDBC.work;

public class Student {
    private Integer id;
    private String name;
    private String sex;
    private String add1;

    public Student() {
    }

    public Student(Integer id, String name, String sex, String add1) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.add1 = add1;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", add1='" + add1 + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAdd1() {
        return add1;
    }

    public void setAdd1(String add1) {
        this.add1 = add1;
    }
}

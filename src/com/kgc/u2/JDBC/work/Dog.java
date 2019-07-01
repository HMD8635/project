package com.kgc.u2.JDBC.work;

public class Dog {
    private Integer id;
    private String type;
    private String color;
    private Integer age;

    public Dog() {
    }

    public Dog(Integer id, String type, String color, Integer age) {
        this.id = id;
        this.type = type;
        this.color = color;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}

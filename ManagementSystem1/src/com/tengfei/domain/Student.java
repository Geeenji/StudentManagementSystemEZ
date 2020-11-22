package com.tengfei.domain;

public class Student {
    private String id;
    private String name;
    private int age;
    private String birthDay;

    public Student() {
    }

    public Student(String id, String name, int age, String birthDay) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.birthDay = birthDay;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }
}

package com.oocl;

public class Student extends Person {
    public String getClassNum() {
        return classNum;
    }

    public void setClassNum(String classNum) {
        this.classNum = classNum;
    }

    private String classNum;

    public String introduce() {
        return String.format("My name is %s. I am %s years old. I am a student of %s. Coding for the glory of OOCL.", this.getName(), this.getAge(), this.getClassNum());
    }
}

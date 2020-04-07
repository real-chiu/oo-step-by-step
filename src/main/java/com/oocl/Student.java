package com.oocl;

public class Student extends Person {
    public String introduce() {
        return String.format("My name is %s. I am %s years old. Coding for the glory of OOCL.", this.getName(), this.getAge());
    }
}

package com.oocl;

public class Teacher extends Person {
    public String introduce() {
        return String.format("My name is %s. I am %s years old. Teaching for the future of world.", this.getName(), this.getAge());
    }
}

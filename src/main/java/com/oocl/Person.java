package com.oocl;
//1. There is a person who has name and age. He can introduce himself, like: My name is Tom. I am 21 years old.
//        2. There is a student who will introduce himself like this: My name is Tom. I am 18 years old. Coding for the glory of OOCL.
//        3. There is a teacher who will introduce himself like this: My name is Woody. I am 30 years old. Teaching for the future of world.

public class Person {
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

    public String introduce() {
        return String.format("My name is %s. I am %s years old.", name, age);
    }
    private String name;
    private int age;

}

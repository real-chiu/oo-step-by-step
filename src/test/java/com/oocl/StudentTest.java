package com.oocl;
//1. There is a person who has name and age. He can introduce himself, like: My name is Tom. I am 21 years old.
//        2. There is a student who will introduce himself like this: My name is Tom. I am 18 years old. Coding for the glory of OOCL.
//        3. There is a teacher who will introduce himself like this: My name is Woody. I am 30 years old. Teaching for the future of world.

import junit.framework.TestCase;

public class StudentTest extends TestCase {

    public void testStudentIntroduce() {
        Student student = new Student();
        student.setAge(18);
        student.setName("Tom");

        String expectedText = "My name is Tom. I am 18 years old. Coding for the glory of OOCL.";
        assertEquals(expectedText, student.introduce());
    }
}
package com.oocl;

import junit.framework.TestCase;

public class TeacherTest extends TestCase {

    public void testTeacherIntroduce() {
        Teacher teacher = new Teacher();
        teacher.setAge(30);
        teacher.setName("Woody");

        String expectedText = "My name is Woody. I am 30 years old. Teaching for the future of world.";
        assertEquals(expectedText, teacher.introduce());
    }
}
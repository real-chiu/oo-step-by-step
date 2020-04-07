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

    public void testTeacherAddSchoolClassTaught() {
        Teacher teacher = new Teacher();
        SchoolClass schoolClass = new SchoolClass();
        schoolClass.setName("test class");
        teacher.addSchoolClassTaught(schoolClass);

        assertEquals(1, teacher.getSchoolClassTaught().size());
    }

    public void testTeacherShouldNotAddSchoolClassTaughtWhenAlreadyTeaching() {
        Teacher teacher = new Teacher();
        SchoolClass schoolClass = new SchoolClass();
        schoolClass.setName("test class");

        teacher.addSchoolClassTaught(schoolClass);
        teacher.addSchoolClassTaught(schoolClass);

        assertEquals(1, teacher.getSchoolClassTaught().size());
    }

    public void testTeacherShouldNotAddSchoolClassTaughtWhenTeachingFiveClasses() {
        Teacher teacher = new Teacher();
        SchoolClass schoolClassOne = new SchoolClass();
        schoolClassOne.setName("test class 1");
        SchoolClass schoolClassTwo = new SchoolClass();
        schoolClassOne.setName("test class 2");
        SchoolClass schoolClassThree = new SchoolClass();
        schoolClassOne.setName("test class 3");
        SchoolClass schoolClassFour = new SchoolClass();
        schoolClassOne.setName("test class 4");
        SchoolClass schoolClassFive = new SchoolClass();
        schoolClassOne.setName("test class 5");
        SchoolClass schoolClassSix = new SchoolClass();
        schoolClassOne.setName("test class 6");

        teacher.addSchoolClassTaught(schoolClassOne);
        teacher.addSchoolClassTaught(schoolClassTwo);
        teacher.addSchoolClassTaught(schoolClassThree);
        teacher.addSchoolClassTaught(schoolClassFour);
        teacher.addSchoolClassTaught(schoolClassFive);

        teacher.addSchoolClassTaught(schoolClassSix);

        assertEquals(5, teacher.getSchoolClassTaught().size());
        assertEquals(false, teacher.getSchoolClassTaught().contains(schoolClassSix));
    }
}
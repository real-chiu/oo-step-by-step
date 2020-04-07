package com.oocl;

import junit.framework.TestCase;

public class SchoolClassTest extends TestCase {

    public void testAddStudent() {
        SchoolClass testSchoolClass = new SchoolClass();
        Student testStudent = new Student();
        testSchoolClass.addStudent(testStudent);
        testStudent.setSchoolClass(testSchoolClass);
        assertEquals(1, testSchoolClass.getStudentListSize());
    }

    public void testAddLeaderWhenStudentInClass() {
        SchoolClass testSchoolClass = new SchoolClass();
        Student testStudent = new Student();
        testStudent.setSchoolClass(testSchoolClass);
        testStudent.setName("Tom");

        testSchoolClass.addStudent(testStudent);
        testSchoolClass.setLeader(testStudent);
        assertEquals("Tom", testSchoolClass.getLeader().getName());
    }

    public void testShouldNotAddLeaderWhenStudentNotInClass() {
        SchoolClass testSchoolClass = new SchoolClass();
        Student testStudent = new Student();
        testStudent.setName("Tom");

        testSchoolClass.setLeader(testStudent);
        assertEquals(null, testSchoolClass.getLeader());
    }

    public void testAddTeacher() {
        SchoolClass testSchoolClass = new SchoolClass();
        Teacher testTeacher = new Teacher();
        testTeacher.setName("Woody");

        testSchoolClass.setTeacher(testTeacher);
        assertEquals("Woody", testSchoolClass.getTeacher().getName());
    }

    public void testTeacherShouldWelcomeStudent() {
        SchoolClass testSchoolClass = new SchoolClass();
        testSchoolClass.setName("Class 2");

        Teacher testTeacher = new Teacher();
        testTeacher.setName("Woody");
        testTeacher.setAge(30);
        testTeacher.addSchoolClassTaught(testSchoolClass);

        testSchoolClass.setTeacher(testTeacher);

        Student testStudent = new Student();
        testStudent.setName("Tom");
        testStudent.setSchoolClass(testSchoolClass);

        testSchoolClass.addStudent(testStudent);
        assertEquals("My name is Woody. I am 30 years old. Teaching for the future of world. Welcome Tom join Class 2.", testSchoolClass.getTeacher().getWelcomeStudentMessage());
    }
}
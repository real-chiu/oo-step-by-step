package com.oocl;

import junit.framework.TestCase;

public class SchoolClassTest extends TestCase {

    public void testAddStudent() {
        SchoolClass testSchoolClass = new SchoolClass();
        Student testStudent = new Student();
        testSchoolClass.addStudent(testStudent);
        testStudent.setSchoolClass(testSchoolClass);
        assertEquals(1, testSchoolClass.getStudentList().size());
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

}
package com.oocl;

import junit.framework.TestCase;

public class SchoolClassTest extends TestCase {

    public void testAddStudent() {
        SchoolClass testSchoolClass = new SchoolClass();
        Student testStudent = new Student();
        testSchoolClass.addStudent(testStudent);
        assertEquals(1, testSchoolClass.getStudentList().size());
    }

}
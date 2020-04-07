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

    public void testShouldNotWelcomeStudentIfNoStudent() {
        SchoolClass testSchoolClass = new SchoolClass();
        testSchoolClass.setName("Class 2");

        Teacher testTeacher = new Teacher();
        testTeacher.setName("Woody");
        testTeacher.setAge(30);
        testTeacher.addSchoolClassTaught(testSchoolClass);

        Student testStudent = new Student();
        testStudent.setName("Tom");
        testStudent.setSchoolClass(testSchoolClass);

        testSchoolClass.addStudent(testStudent);
        assertEquals(null, testSchoolClass.getTeacher());
        assertEquals(null, testTeacher.getWelcomeStudentMessage());
    }

    public void testTeacherShouldWelcomeLeader() {
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
        testSchoolClass.setLeader(testStudent);

        assertEquals("My name is Woody. I am 30 years old. Teaching for the future of world. Tom is the leader of Class 2.", testSchoolClass.getTeacher().getWelcomeLeaderMessage());
    }

    public void testShouldNotWelcomeLeaderIfNoLeader() {
        SchoolClass testSchoolClass = new SchoolClass();
        testSchoolClass.setName("Class 2");

        Teacher testTeacher = new Teacher();
        testTeacher.setName("Woody");
        testTeacher.setAge(30);
        testTeacher.addSchoolClassTaught(testSchoolClass);

        Student testStudent = new Student();
        testStudent.setName("Tom");
        testStudent.setSchoolClass(testSchoolClass);

        testSchoolClass.setLeader(testStudent);
        assertEquals(null, testSchoolClass.getLeader());
        assertEquals(null, testTeacher.getWelcomeLeaderMessage());
    }

    public void testStudentsShouldWelcomeStudent() {
        SchoolClass testSchoolClass = new SchoolClass();
        testSchoolClass.setName("Class 2");

        Teacher testTeacher = new Teacher();
        testTeacher.setName("Woody");
        testTeacher.setAge(30);
        testTeacher.addSchoolClassTaught(testSchoolClass);

        testSchoolClass.setTeacher(testTeacher);

        Student testStudent = new Student();
        testStudent.setName("Tom");
        testStudent.setAge(15);
        testStudent.setSchoolClass(testSchoolClass);

        Student testStudentTwo = new Student();
        testStudentTwo.setName("Peter");
        testStudentTwo.setAge(12);
        testStudentTwo.setSchoolClass(testSchoolClass);

        Student testStudentThree = new Student();
        testStudentThree.setName("John");
        testStudentThree.setAge(15);
        testStudentThree.setSchoolClass(testSchoolClass);

        testSchoolClass.addStudent(testStudent);
        testSchoolClass.addStudent(testStudentTwo);
        assertEquals("My name is Tom. I am 15 years old. I am a student of Class 2. Coding for the glory of OOCL. Welcome Peter join Class 2.", testSchoolClass.getStudentsWelcomeStudent().get(0));

    }

    public void testFirstStudentShouldNotWelcomeStudent() {
        SchoolClass testSchoolClass = new SchoolClass();
        testSchoolClass.setName("Class 2");

        Teacher testTeacher = new Teacher();
        testTeacher.setName("Woody");
        testTeacher.setAge(30);
        testTeacher.addSchoolClassTaught(testSchoolClass);

        testSchoolClass.setTeacher(testTeacher);

        Student testStudent = new Student();
        testStudent.setName("Tom");
        testStudent.setAge(15);
        testStudent.setSchoolClass(testSchoolClass);

        testSchoolClass.addStudent(testStudent);
        assertEquals(null, testSchoolClass.getStudentsWelcomeStudent().get(0));
    }

    public void testStudentShouldWelcomeLeader() {
        SchoolClass testSchoolClass = new SchoolClass();
        testSchoolClass.setName("Class 2");

        Teacher testTeacher = new Teacher();
        testTeacher.setName("Woody");
        testTeacher.setAge(30);
        testTeacher.addSchoolClassTaught(testSchoolClass);

        testSchoolClass.setTeacher(testTeacher);

        Student testStudent = new Student();
        testStudent.setName("Tom");
        testStudent.setAge(15);
        testStudent.setSchoolClass(testSchoolClass);

        Student testStudentTwo = new Student();
        testStudentTwo.setName("Peter");
        testStudentTwo.setAge(12);
        testStudentTwo.setSchoolClass(testSchoolClass);

        Student testStudentThree = new Student();
        testStudentThree.setName("John");
        testStudentThree.setAge(15);
        testStudentThree.setSchoolClass(testSchoolClass);

        testSchoolClass.addStudent(testStudent);
        testSchoolClass.addStudent(testStudentTwo);

        testSchoolClass.setLeader(testStudent);

        assertEquals("My name is Tom. I am 15 years old. I am a student of Class 2. Coding for the glory of OOCL. Tom is the leader of Class 2.", testSchoolClass.getStudentsWelcomeLeader().get(0));
    }

    public void testStudentShouldNotWelcomeLeaderIfNoLeader() {
        SchoolClass testSchoolClass = new SchoolClass();
        testSchoolClass.setName("Class 2");

        Teacher testTeacher = new Teacher();
        testTeacher.setName("Woody");
        testTeacher.setAge(30);
        testTeacher.addSchoolClassTaught(testSchoolClass);

        testSchoolClass.setTeacher(testTeacher);

        Student testStudent = new Student();
        testStudent.setName("Tom");
        testStudent.setAge(15);
        testStudent.setSchoolClass(testSchoolClass);

        Student testStudentTwo = new Student();
        testStudentTwo.setName("Peter");
        testStudentTwo.setAge(12);
        testStudentTwo.setSchoolClass(testSchoolClass);

        Student testStudentThree = new Student();
        testStudentThree.setName("John");
        testStudentThree.setAge(15);
        testStudentThree.setSchoolClass(testSchoolClass);

        testSchoolClass.addStudent(testStudent);
        testSchoolClass.addStudent(testStudentTwo);

        assertEquals(null, testSchoolClass.getStudentsWelcomeLeader().get(0));
    }
}

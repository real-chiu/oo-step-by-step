package com.oocl;

import java.util.ArrayList;

public class SchoolClass {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
    private ArrayList<Student> studentList = new ArrayList<Student>();;

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    private void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }

    public void addStudent(Student student) {
        this.studentList.contains(new Object());
        if (!studentList.contains(student)) {
            studentList.add(student);
        }
    }
}

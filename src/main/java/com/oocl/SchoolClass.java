package com.oocl;

import java.util.ArrayList;

public class SchoolClass {
    private String name;

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    private Teacher teacher;
    private ArrayList<Student> studentList = new ArrayList<Student>();;

    public Student getLeader() {
        return leader;
    }

    public void setLeader(Student leader) {
        if (studentList.contains(leader)) {
            this.leader = leader;
        }
    }

    private Student leader;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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

package com.oocl;

import java.util.ArrayList;

public class SchoolClass {
    private String name;
    private Student leader;
    private Teacher teacher;
    private ArrayList<Student> studentList = new ArrayList<Student>();

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Student getLeader() {
        return leader;
    }

    public void setLeader(Student leader) {
        if (studentList.contains(leader)) {
            this.leader = leader;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getStudentListSize() {
        return studentList.size();
    }

    public void addStudent(Student student) {
        this.studentList.contains(new Object());
        if (!studentList.contains(student)) {
            studentList.add(student);
            if (teacher != null) {
                teacher.setWelcomeMessage(student.getName(), getName());
            }
        }
    }
}

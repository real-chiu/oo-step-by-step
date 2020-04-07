package com.oocl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
            if (teacher != null) {
                teacher.setWelcomeLeaderMessage(leader.getName(), getName());
            }
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

    public List<String> getStudentsWelcome() {
        return studentList.stream().map(otherStudent -> otherStudent.getWelcomeStudentMessage()).collect(Collectors.toList());
    }

    public void addStudent(Student student) {
        this.studentList.contains(new Object());
        if (!studentList.contains(student)) {
            studentList.stream().forEach(otherStudent -> otherStudent.setWelcomeStudentMessage(student.getName(), getName()));
            studentList.add(student);
            if (teacher != null) {
                teacher.setWelcomeMessage(student.getName(), getName());
            }
        }
    }
}

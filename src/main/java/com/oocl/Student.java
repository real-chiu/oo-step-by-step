package com.oocl;

public class Student extends Person {
    private SchoolClass schoolClass;
    private String welcomeStudentMessage;
    private String welcomeLeaderMessage;

    public void setSchoolClass(SchoolClass schoolClass) {
        this.schoolClass = schoolClass;
    }

    public SchoolClass getSchoolClass() {
        return schoolClass;
    }

    public String introduce() {
        return String.format("My name is %s. I am %s years old. I am a student of %s. Coding for the glory of OOCL.", this.getName(), this.getAge(), this.getSchoolClass().getName());
    }

    public void setWelcomeStudentMessage(String studentName, String className) {
        welcomeStudentMessage = String.format("Welcome %s join %s.", studentName, className);
    }

    public String getWelcomeStudentMessage() {
        return welcomeStudentMessage == null ? null : introduce() + " " + welcomeStudentMessage;
    }

    public void setWelcomeLeaderMessage(String studentName, String className) {
        welcomeLeaderMessage = String.format("%s is the leader of %s.", studentName, className);
    }

    public String getWelcomeLeaderMessage() {
        return welcomeLeaderMessage == null ? null : introduce() + " " + welcomeLeaderMessage;
    }
}

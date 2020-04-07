package com.oocl;

public class Student extends Person {
    public void setSchoolClass(String schoolClass) {
        this.schoolClass = schoolClass;
    }

    public String getSchoolClass() {
        return schoolClass;
    }

    private String schoolClass;

    public String introduce() {
        return String.format("My name is %s. I am %s years old. I am a student of %s. Coding for the glory of OOCL.", this.getName(), this.getAge(), this.getSchoolClass());
    }
}

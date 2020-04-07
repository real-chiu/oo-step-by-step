package com.oocl;

public class Student extends Person {
    private SchoolClass schoolClass;

    public void setSchoolClass(SchoolClass schoolClass) {
        this.schoolClass = schoolClass;
    }

    public SchoolClass getSchoolClass() {
        return schoolClass;
    }

    public String introduce() {
        return String.format("My name is %s. I am %s years old. I am a student of %s. Coding for the glory of OOCL.", this.getName(), this.getAge(), this.getSchoolClass().getName());
    }
}

package com.oocl;

import java.util.ArrayList;

public class Teacher extends Person {
    private ArrayList<SchoolClass> schoolClassTaught = new ArrayList<SchoolClass>();

    public int getSchoolClassTaughtSize() {
        return schoolClassTaught.size();
    }
    public boolean checkIfSchoolClassTaughtContains(SchoolClass schoolClass) {
        return schoolClassTaught.contains(schoolClass);
    }

    public void addSchoolClassTaught(SchoolClass schoolClassTaught) {
        if (this.schoolClassTaught.size() < 5 && !this.schoolClassTaught.contains(schoolClassTaught)) {
            this.schoolClassTaught.add(schoolClassTaught);
        }
    }

    public String introduce() {
        return String.format("My name is %s. I am %s years old. Teaching for the future of world.", this.getName(), this.getAge());
    }
}

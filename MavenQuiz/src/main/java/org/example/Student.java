package org.example;

public class Student {
    String firstName;
    String lastName;
    int grade;

    public Student() {
    }

    public Student(String firstName) {
        this.firstName = firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }
}

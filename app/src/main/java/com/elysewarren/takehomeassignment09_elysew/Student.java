package com.elysewarren.takehomeassignment09_elysew;

/**
 * Created by elysewarren on 4/10/17.
 */

public class Student {
    public String studentName;
    public int age;
    public boolean knowsScratch;

    public Student() {
    }

    public Student(String studentName, int age, boolean knowsScratch) {
        this.studentName = studentName;
        this.age = age;
        this.knowsScratch = knowsScratch;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getAge() {
        return age;
    }

    public boolean isKnowsScratch() {
        return knowsScratch;
    }

    @Override
    public String toString() {
        return "Student Name:" + studentName + "\n Student Age:" + age + "\n Knows Scratch:" + knowsScratch + "\n";
    }
}

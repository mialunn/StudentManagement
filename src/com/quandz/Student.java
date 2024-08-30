package com.quandz;

public class Student {

    private final String id;
    private String fullName;
    private String yob;
    private double gpa;

    public Student(String id, String fullName, String yob, double gpa) {
        this.id = id;
        this.fullName = fullName;
        this.yob = yob;
        this.gpa = gpa;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setYob(String yob) {
        this.yob = yob;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getYob() {
        return yob;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", fullName=" + fullName + ", yob=" + yob + ", gpa=" + gpa + '}';
    }

}

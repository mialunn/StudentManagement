package com.quandz;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StudentContainer {

    private final String id;

    private final ArrayList<Student> students;

    private final Scanner sc = new Scanner(System.in);

    public StudentContainer(String id) {
        this.id = id;
        this.students = new ArrayList();
    }

    public void createNewStudentPrompt() {

        System.out.println("Creating student #" + (this.students.size() + 1));

        System.out.print("Student Id: ");
        String studentId = this.getStudentId();

        System.out.print("Student fullname: ");
        String studentFullname = Utils.getString("Please provide a name to continue");

        System.out.print("Student yob: ");
        String studentYob = Utils.getString("Please provide a year to continue");

        System.out.print("Student GPA: ");
        double studentGpa = this.getGPA();

        Student student = new Student(studentId, studentFullname, studentYob, studentGpa);
        students.add(student);

        System.out.println("");
        System.out.println("Student " + studentId + " successfully added to " + id + " container!");
        System.out.println("");
    }

    // Checking the student id format using regular expression
    private String getStudentId() {
        Pattern pattern = Pattern.compile("^[A-Z]{2}\\d{6}$");

        while (true) {
            String input = Utils.getString("Please provide an id to continue!");
            Matcher matcher = pattern.matcher(input);

            if (!matcher.find()) {
                System.out.println("Please provide an valid id like (SE19xxxx)");
                continue;
            }

            return input;
        }
    }

    // Scale 10
    private double getGPA() {
        while (true) {
            double input = Utils.getDouble("GPA has to be a number!");

            if (input < 10 || input > 10) {
                System.out.println("Please provide a number between 0..10");
                continue;
            }

            return input;
        }
    }

    public void listStudents() {
        System.out.println("----------------------------------");
        System.out.println("There is/are " + students.size() + " students in this container!");

        students.forEach(student -> {
            System.out.println(student.toString());
        });

        System.out.println("----------------------------------");
    }

    public void createRemoveStudentPrompt() {
        Student target = null;
        System.out.print("Please type in student id: ");
        String studentId = Utils.getString("Please provide a string to continue");

        for (Student student : students) {
            if (student.getId().equals(studentId)) {
                target = student;
            }
        }

        if (target != null) {
            students.remove(target);
        } else {
            System.out.println("Student do not exist!");
        }
    }
}

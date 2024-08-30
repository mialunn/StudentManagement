package com.quandz;

public class StudentManagement {

    public static void main(String[] args) {
        System.out.println("WELCOME TO FU PORTAL");
        StudentContainer container = new StudentContainer("FPT EDU");
        int choice;

        do {
            displayMenu();
            choice = Utils.getInteger("Please provide a valid number!");

            switch (choice) {
                case 1:
                    container.createNewStudentPrompt();
                    break;
                case 2:
                    container.listStudents();
                    break;
                case 3:
                    container.createRemoveStudentPrompt();
                    break;
                case 6:
                    System.out.println("Goodbye, see you later!");
                    break;
                default:
                    System.out.println("Please provide a number between 1 and 3");
                    break;
            }

        } while (choice != 6);
    }

    public static void displayMenu() {
        System.out.println("Please choose an option:");
        System.out.println("1) Create new student");
        System.out.println("2) Display all students");
        System.out.println("3) Remove student");
        System.out.println("6) Exit");

        System.out.print("Type it here: ");
    }

}

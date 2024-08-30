package com.quandz;

import java.util.Scanner;

public class Utils {

    private static final Scanner scanner = new Scanner(System.in);

    public static int getInteger(String errorMessage) {
        while (true) {
            try {
                String input = scanner.nextLine();
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println(errorMessage);
            }
        }
    }

    public static double getDouble(String errorMessage) {
        while (true) {
            try {
                String input = scanner.nextLine();
                return Double.parseDouble(input);
            } catch (NumberFormatException e) {
                System.out.println(errorMessage);
            }
        }
    }

    public static String getString(String nullMessage) {
        while (true) {
            String input = scanner.nextLine();

            if (input == null || input.length() == 0) {
                System.out.println(nullMessage);
                continue;
            }

            return input;
        }
    }
}

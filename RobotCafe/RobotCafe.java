package RobotCafe;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RobotCafe {
    static final int MIN_CODE = 1000;
    static final int MAX_CODE = 9999;

    public static void main(String[] args) {
        String[] products = { "Kaffe", "Te", "Bulle", "Energidryck" };
        readMenuChoice(products);
    }

    static void printMenu(String[] products) {
        for (int i = 0; i < products.length; i++) {
            System.out.println(i + 1 + ". " + products[i]);
        }
    }

    static void readMenuChoice(String[] products) {
        Scanner scanner = new Scanner(System.in);
        int menuChoice = -1;
        boolean ordered = false;
        System.out.println("Welcome to the cofe shop");
        System.out.println("Choose a prodcut by typing numbers between 1-4");
        printMenu(products);

        while (menuChoice < 1 || menuChoice > products.length) {
            try {
                menuChoice = scanner.nextInt();
                if (menuChoice == 0) {
                    System.out.println("END SHOPPING");
                    break;
                } else if (menuChoice >= 1 && menuChoice <= products.length) {
                    System.out.println("You have succesfully ordered " + products[menuChoice - 1]);
                    ordered = true;
                } else {
                    System.out.println("Try again and choose a number");
                }

            } catch (InputMismatchException e) {
                System.out.println("Invalid input! You must choose between numbers 1-4");
                scanner.next();

            }

        }

        if (ordered) {

            System.out.println("Type the robot code to confirm");
            int robotCode = scanner.nextInt();

            try {
                validateRobotCode(robotCode);
                System.out.println("Robot code accepted!");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    static void validateRobotCode(int code) {
        if (code < MIN_CODE || code > MAX_CODE) {
            throw new IllegalArgumentException("Invalid Code");
        }
    }

}

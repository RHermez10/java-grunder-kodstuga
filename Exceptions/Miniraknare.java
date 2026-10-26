package Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Miniraknare {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 2 numbers");

        try {
            int one = scanner.nextInt();
            int two = scanner.nextInt();
            System.out.println(one / two);
        } catch (ArithmeticException e) {
            System.out.println("Kan inte dela med 0");
        } catch (InputMismatchException e) {
            System.out.println("Du måste skriva in ett giltlig tal mellan 1-100");
        } finally {
            System.out.println("Programmet är klart");

        }
        scanner.close();

    }

}

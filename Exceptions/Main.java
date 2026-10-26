package Exceptions;

public class Main {
    public static void main(String[] args) {
        // FRÅGA 2
        // Läs felmeddelandet i terminalen. Vilken exception-typ får du?
        // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5
        // out of bounds for length 3
        int[] treasure = { 100, 200, 300 };

        try {
            System.out.println(treasure[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index 5 out of bounds");
            System.out.println(e.getMessage());
        }

        try {
            checkScore(85);
            checkScore(200);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());

        }

        int age = 20; // Raden är korrekt
        int number = 10 / 0; // Körnings fel
        int[] values = new int[3]; // Korreckt rad
        System.out.println("Test" + values[3]);// Körningsfel
        double price = 19.95; // Raden är korrektt;
    }

    static void checkScore(int score) {

        if (score < 0 || score > 100) {
            throw new IllegalArgumentException("This is wrong");
        }
        System.out.println("Score " + score + " approved");

    }

}

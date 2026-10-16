package Fridays;

public class Grettings {
    public static void main(String[] args) {
        grettings("Marta");
        favouriteNumber(10);
        grettings("Ronaldo");
        favouriteNumber(12);
        grettings("Messi");
        favouriteNumber(8);
    }

    static void grettings(String name) {
        System.out.println("Hello " + name + "! " + "I'm your Robot");
    }

    static void favouriteNumber(int number) {
        System.out.println("My favourite number is:  " + number);
    }
}
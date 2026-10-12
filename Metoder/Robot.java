package Metoder;

public class Robot {

    public static void main(String[] args) {

        // Övning 1
        grettings();

        // Övning 2
        int result = beraknaPris(3, 150);
        System.out.println("The total prize is: " + result);

        // Övning 3
        int powerLevel = powerLevel(40, 20, 30);
        System.out.println("This superhero is this strong: " + powerLevel);

        // Övning 4

    }

    // Övning 1 – Hälsningsroboten
    static void grettings() {
        System.out.println("Hello human!, I am a robot.");

    }

    // Övning 2 – Pizzakalkylatorn
    static int beraknaPris(int pizzor, int pris) {

        return pizzor * pris;
    }

    // Övning 3 – Superhjältekraft

    static int powerLevel(int strength, int speed, int intelligence) {
        return strength + speed + intelligence;
    }

}

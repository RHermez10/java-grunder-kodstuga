package Klasser;

public class Robot {
    String name;
    private int batteri;

    Robot(String name) {
        this.name = name;
    }

    Robot(int batteri) {
        this.batteri = batteri;
    }

    void visaStatus() {
        System.out.println("Name: " + name);
        System.out.println("Batteri " + batteri);
    }
}
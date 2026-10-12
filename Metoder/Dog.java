package Metoder;

public class Dog {

    // Övning 4 – Den hungriga hunden

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.showHunger();
        dog1.eat();
        dog1.showHunger();

    }

    int hunger = 10;

    void eat() {
        hunger--;
    }

    void showHunger() {
        System.out.println("This dogs hunger " + hunger);

    }
}
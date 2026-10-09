package KodStuga;

public class Pet {
    private String name;
    private int hunger;
    private int energy;

    Pet(String name, int hunger, int energy) {
        this.name = name;
        this.hunger = hunger;
        this.energy = energy;
    }

    void eat() {
        hunger -= 5;
        energy += 5;

        if (hunger > 20) {
            System.out.println(name + ": " + "I'M GETTING TOO HUNGRY!! GIVE ME FOOD");
        }
    }

    void play() {

        if (energy < 30) {
            System.out.println(name + ": " + " I DONT WANT TO PLAY. MY ENERGY IS LOW");
            return;
        }
        hunger += 5;
        energy -= 5;

    }
}
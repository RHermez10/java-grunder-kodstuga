package Monday.Ovning4;

public class Talent {

    public static void main(String[] args) {

        Animals dog = new Dog();
        Animals cat = new Cat();

        dog.makeSound();
        cat.makeSound();

        showTalent((Playable) dog);
    }

    public static void showTalent(Playable participant) {
        participant.play();

    }

}

abstract class Animals {
    public abstract void makeSound();
}

interface Playable {
    void play();
}

class Dog extends Animals implements Playable {

    public void makeSound() {
        System.out.println("Woof Woof");
    }

    public void play() {
        System.out.println("run after the stick");
    }

}

class Cat extends Animals {

    public void makeSound() {
        System.out.println("MEOOWW");
    }

}

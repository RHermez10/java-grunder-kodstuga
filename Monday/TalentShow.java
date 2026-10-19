package Monday;

public class TalentShow {

    public static void main(String[] args) {

        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.makeSound();
        cat.makeSound();
    }

}

abstract class Animal {
    public abstract void makeSound();
}

interface Playable {
    void play();
}

class Dog extends Animal implements Playable {

    public void makeSound() {
        System.out.println("Woof Woof");
    }

    public void play() {
        System.out.println("run after the stick");
    }

}

class Cat extends Animal {

    public void makeSound() {
        System.out.println("MEOOWW");
    }

}

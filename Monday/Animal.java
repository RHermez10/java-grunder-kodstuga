package Monday;

public class Animal {

    public static void main(String[] args) {

        Dog newDog = new Dog("maxi");
        Cat newCat = new Cat("Velo");
        Lion newLion = new Lion("Simba");

        newDog.makeSound();
        newCat.makeSound();
        newLion.makeSound();
    }

    String name;

    Animal(String name) {
        this.name = name;
    }

    void makeSound() {
        System.out.println("make some sound");
    }
}

class Dog extends Animal {
    Dog(String name) {
        super(name);
    }

    void makeSound() {
        System.out.println("WOOF WOOOF ");
    }
}

class Cat extends Animal {
    Cat(String name) {
        super(name);
    }

    void makeSound() {
        System.out.println("MEOW");
    }
}

class Lion extends Animal {
    Lion(String name) {
        super(name);

    }

    void makeSound() {
        System.out.println("RAW RAW");
    }
}

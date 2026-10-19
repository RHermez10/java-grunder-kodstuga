package Monday;

public class Talent {

    public static void main(String[] args) {

        Animals dog = new Monkey();
        Animals cat = new Shark();

        dog.makeSound();
        cat.makeSound();

        showTalent(new Monkey());

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

class Monkey extends Animals implements Playable {

    public void makeSound() {
        System.out.println("Woof Woof");
    }

    public void play() {
        System.out.println("run after the stick");
    }

}

class Shark extends Animals {

    public void makeSound() {
        System.out.println("MEOOWW");
    }

}

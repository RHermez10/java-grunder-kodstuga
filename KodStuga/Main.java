package KodStuga;

public class Main {

    public static void main(String[] args) {

        Djur dog = new Djur("Max", 3, "WOOF WOOF");
        Djur cat = new Djur("Velo", 4, "MEOWWWW");
        dog.gorLjud();
        cat.gorLjud();

        Monster myMonster = new Monster("Poker", 15);

        while (true) {
            myMonster.health--;
            System.out.println(myMonster.health);
            if (myMonster.health <= 0) {
                break;
            }
        }

        Pet myPet = new Pet("Maxiii", 30, 20);

        myPet.eat();
        myPet.play();
    }
}

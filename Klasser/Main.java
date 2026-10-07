package Klasser;

public class Main {
    public static void main(String[] args) {

        // ÖVNING 1
        Djur dog = new Djur("WOOF WOOF");
        Djur cat = new Djur("MJUAWWWW");

        dog.gorLjud();
        cat.gorLjud();

        // ÖVNING 2
        GameCharacter character1 = new GameCharacter("Marta", 3);
        GameCharacter character2 = new GameCharacter("Leon", 1);

        character1.present();
        character2.present();

        // ÖVNING 3

        Robot robot = new Robot("paul");
        Robot robot2 = new Robot(30);
        robot.visaStatus();
        robot2.visaStatus();

    }
}

package Klasser;

public class GameCharacter {

    String name;
    int lives;

    GameCharacter(String name, int lives) {
        this.name = name;
        this.lives = lives;
    }

    void present() {
        System.out.println("Characters name: " + name + " " + "Lives: " + lives);
    }

}

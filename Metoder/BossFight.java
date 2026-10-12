package Metoder;

public class BossFight {
    int health = 100;

    public static void main(String[] args) {

        BossFight player = new BossFight();

        player.attack();
        player.attack(40);
        System.out.println("The playes health is: " + player.getHealth());
        killMonster();
    }

    // Övning 7 – Boss fight – Metodprogrammet

    void attack() {
        System.out.println("ATTACK");
    }

    void attack(int damage) {
        System.out.println("The player does " + damage + " Damage!");
    }

    int getHealth() {
        return health;
    }

    static void killMonster() {
        System.out.println("ATTACK the monster");

    }

}

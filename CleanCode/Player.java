package CleanCode;

public class Player {
    private String name;
    private int health;
    private int coins;

    Player(String name, int health, int coins) {
        this.name = name;
        this.health = health;
        this.coins = coins;
    }

    public boolean canBuyPotion(int price) {
        return coins >= price;
    }

    public void buyPotion(int price) {
        coins -= price;

    }

    public void heal(int amount) {
        health = Math.min(100, health + amount);
    }

    public void printStatus() {
        System.out.println(name + ": " + "Health: " + health + " coins: " + coins);
    }

}

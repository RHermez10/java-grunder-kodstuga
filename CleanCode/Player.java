package CleanCode;

public class Player {
    static final int PORTIONPRICE = 15;
    String name;
    int health;
    int coins;
    int coinsLeft;

    Player(String name, int health, int coins) {
        this.name = name;
        this.health = health;
        this.coins = coins;
    }

    public void canBuyPotion() {
        if (coins >= PORTIONPRICE) {
            System.out.println("You have enough money to buy");
        } else {
            System.out.println("You don't have enough money to buy");
        }
    }

    public int buyPotion() {
        return coins = coins - PORTIONPRICE;
    }

    void heal() {
        if (health < 100) {
            health += 3;
        }
    }

    public void printStatus() {
        System.out.println(name + ": " + "Health: " + health + " coins: " + coins);
    }

}

/*
 * · Skapa en klass Player med name, health och coins.
 * 
 * · Skapa en metod canBuyPotion(int price) som svarar på om spelaren har råd.
 * 
 * · Skapa en metod buyPotion(int price) som drar coins.
 * 
 * · Skapa en metod heal(int amount) som höjer health. Health ska inte gå över
 * 100.
 * 
 * · Skapa en metod printStatus() som visar spelarens status.
 */

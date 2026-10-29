package CleanCode;

public class PotionShop {
    public static void main(String[] args) {

        Player player1 = new Player("Marta", 50, 20);

        System.out.println("Status of: ");
        player1.printStatus();

        if (player1.canBuyPotion(15)) {
            System.out.println("Marta can afford the potion.");
        }
        player1.buyPotion(15);
        player1.heal(20);

        System.out.println("Status after game: ");
        player1.printStatus();

    }

}

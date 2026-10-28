package CleanCode;

public class PotionShop {
    public static void main(String[] args) {

        Player player1 = new Player("Marta", 50, 20);

        System.out.println("Status of: ");
        player1.printStatus();

        player1.canBuyPotion();
        player1.buyPotion();
        player1.heal();

        System.out.println("Status after game: ");
        player1.printStatus();

    }

}

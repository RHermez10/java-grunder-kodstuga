package CleanCode;

public class Main {

    public static void main(String[] args) {
        String name = "Mira";
        int antalDrickor = 3;
        double pris = 30.0;
        double totalPris = antalDrickor * pris;
        System.out.println(name + " köper drycker för " + totalPris + " kr.");

        // MAGIC NUMBER MONSTER
        final int HIGHSCORE = 100;
        int playerScore = 120;
        if (playerScore >= HIGHSCORE) {
            System.out.println("Level up!");
        }

        // METODKIRURGEN
        totalPris();

    }

    // METODKIRURGEN
    final static int POTIONPRICE = 30;
    static int coins = 100;
    static int numberOfPotions = 2;
    static int totalCost;

    static int beraknaPris() {
        return totalCost = numberOfPotions * POTIONPRICE;
    }

    static void totalPris() {
        beraknaPris();
        if (coins >= totalCost) {
            System.out.println("Köpet lyckades. Kostnad: " + totalCost + " coins.");
        } else {
            System.out.println("Du har inte tillräckligt med coins.");
        }
    }
}

package Fridays;

public class DreamTeam {

    public static void main(String[] args) {

        String[] players = { "Oscar", "Fernando", "Drogba", "Willian", "Lampard" };

        // First player
        System.out.println(players[0]);

        // Last player
        System.out.println(players[4]);

        // Change one of the player
        players[4] = "Ronaldo";
        System.out.println(players[4]);

        // Print player with for loop
        System.out.println("ALL THE PLAYERS");
        for (int player = 0; player < players.length; player++) {
            System.out.println(players[player]);
        }

        // NUMBER OF PLAYERS
        System.out.println("TOTAL PLAYERS " + players.length);

        // ENHANCED FOR LOOP
        System.out.println("ENHANCED FOR LOOP");
        for (String player : players) {
            System.out.println(player);
        }
    }
}
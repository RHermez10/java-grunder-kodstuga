package Metoder;

public class Player {

    public static void main(String[] args) {

        // Övning 5
        Player player1 = new Player();
        player1.setScore(100);

        System.out.println("Score: " + player1.getScore());

        // Övning 6

        showPower(30);
        showPower("40");
    }

    // Övning 5 – Hemlig highscore
    private int score = 10;

    int getScore() {
        return score;
    }

    void setScore(int score) {
        this.score = score;
    }

    // Övning 6 – Samma metod, olika magi

    static void showPower(int power) {

        System.out.println("Power: " + power);
    }

    static void showPower(String power) {

        System.out.println("Power: " + power);
    }
}
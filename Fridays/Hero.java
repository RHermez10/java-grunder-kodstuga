package Fridays;

import java.util.Arrays;

public class Hero {

    private int points;

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public static void main(String[] args) {
        Hero newHero = new Hero();

        int[] pointsValues = { 10, 20, 5, 50, 15 };

        int sum = 0;

        for (int i = 0; i < pointsValues.length; i++) {
            sum += pointsValues[i];
        }
        newHero.setPoints(sum);

        System.out.println("This is your total points: " + newHero.getPoints());
        System.out.println("The Highest points you can get: " + highestPoint(pointsValues));
    }

    // METOD SOM GER HÖGSTA POÄNG
    static int highestPoint(int[] pointsValues) {
        Arrays.sort(pointsValues);
        return pointsValues[pointsValues.length - 1];
    }
}
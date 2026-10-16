package Fridays;

import java.util.Arrays;

public class Treasure {

    public static void main(String[] args) {

        int[] gold = { 2, 20, 8, 10, 70 };
        System.out.println(countGold(gold));

        biggestGold(gold);
    }

    static int countGold(int gold[]) {
        int sum = 0;

        for (int i = 0; i < gold.length; i++) {
            sum += gold[i];
        }
        return sum;
    }

    // BIGGEST GOLD
    static void biggestGold(int gold[]) {
        Arrays.sort(gold);
        System.out.println("Highest gold: " + gold[gold.length - 1]);
    }
}
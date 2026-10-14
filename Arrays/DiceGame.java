package Arrays;

import java.util.Arrays;

public class DiceGame {

    public static void main(String[] args) {

        int[] dice = { 1, 5, 2, 4, 6, };

        // FOR LOOP FÖR ATT SKRIVA UT ALLA KAST
        for (int i = 0; i < dice.length; i++) {
            System.out.println(dice[i]);
        }

        // TOTAL RESULT
        int sum = 0;
        for (int i = 0; i < dice.length; i++) {
            sum += dice[i];
        }
        System.out.println("The result: " + sum);

        // SORT ARRAY
        Arrays.sort(dice);
        System.out.println("Dice:     " + Arrays.toString(dice));
        System.out.println("Lowest roll: " + dice[0]);
        System.out.println("Highest roll: " + dice[dice.length - 1]);
        System.out.println(Arrays.binarySearch(dice, 6));

    }
}
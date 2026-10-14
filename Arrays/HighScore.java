package Arrays;

import java.util.Arrays;

public class HighScore {

    public static void main(String[] args) {

        int[] points = { 10, 1, 85, 66, 20 };

        // FOR LOOP TO PRINT OUT THE POINTS
        for (int i = 0; i < points.length; i++) {
            System.out.println("The Points: " + points[i]);
        }

        // PRINT TOTAL RESULT OF POINTS
        int result = 0;
        for (int i = 0; i < points.length; i++) {
            result += points[i];
        }

        System.out.println("Total points: " + result);

        // SORT ARRAY
        Arrays.sort(points);
        for (int i : points) {
            System.out.println("Sort Arrays:    " + i);
        }

        // HIGHEST SCORE
        System.out.println("Highest score: " + points[points.length - 1]);

        // ARRAY TO STRING

        System.out.println("Array to String:     " + Arrays.toString(points));

    }

}

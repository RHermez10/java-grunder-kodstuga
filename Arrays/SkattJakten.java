package Arrays;

public class SkattJakten {

    public static void main(String[] args) {

        int[][] map;
        map = new int[3][3];

        map[1][2] = 1;

        for (int row = 0; row < map.length; row++) {

            for (int col = 0; col < map[row].length; col++) {
                System.out.print(map[row][col] + " ");
            }

            System.out.println();

        }
    }
}
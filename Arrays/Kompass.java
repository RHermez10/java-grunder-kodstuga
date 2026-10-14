package Arrays;

public class Kompass {

    public static void main(String[] args) {

        enum Direction {
            NORTH, EAST, SOUTH, WEST
        }

        Direction newDirection = Direction.EAST;

        switch (newDirection) {
            case NORTH:
                System.out.println("The Diretion is north");
                break;
            case EAST:
                System.out.println("The Diretion is East");
                break;
            case SOUTH:
                System.out.println("The direction is South");
                break;

            case WEST:
                System.out.println("The direction is West");
                break;
        }

        Direction[] allDirection = Direction.values();
        for (Direction i : allDirection) {
            System.out.println(i);
        }

    }

}

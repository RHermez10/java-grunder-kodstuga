package Fridays;

public class SuperKraft {

    public static void main(String[] args) {
        enum superKraft {
            ELD, IS, VIND, BLIXT
        }

        superKraft myPower = superKraft.IS;

        switch (myPower) {
            case ELD:
                System.out.println("We're on fire");
                break;
            case IS:
                System.out.println("Let's freeze");
                break;
            case VIND:
                System.out.println("The storm is coming");
                break;
            case BLIXT:
                System.out.println("FLASH FLASH FLASH");
                break;
        }

        System.out.println("ALL THE POWERS");
        for (superKraft power : superKraft.values()) {
            System.out.println(power);
        }
    }
}
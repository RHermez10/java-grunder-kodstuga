package Arrays;

public class Spel {

    public static void main(String[] args) {

        // 1. Ditt eget spellager

        String[] object = { "Sword", "Knife", "Gun", "Clock", "Hammer" };

        // PRINT FIRST OBJECT
        System.out.println("First object: " + object[0]);

        // PRINT LAST OBJECT
        System.out.println("Last object: " + object[4]);

        // CHANGE THIRD OBJECT TO A BETTER OBJECT
        object[2] = "Stone";
        System.out.println(object[2]);

        // PRINT THE LENGTH OF THE ARRAY
        System.out.println("The length: " + object.length);

        // PRINT THE WHOLE LIST
        for (String i : object) {
            System.out.println(i);
        }
    }
}
package KodStuga;

public class Delbana {

    public static void main(String[] args) {

        int age = 18;
        double height = 120;

        if (age >= 18 && height >= 130) {
            System.out.println("You can ride the roller coaster");
        } else if (age >= 18 && height <= 130) {
            System.out.println("You need to be taller than 130cm to ride the roller coaster");
        } else {
            System.out.println("You are not old enough. You need to be at least 18 years old");
        }

    }

}

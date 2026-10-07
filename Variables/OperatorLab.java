package Variables;

public class OperatorLab {
    public static void main(String[] args) {

        int a = 10;
        int b = 3;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        // DEL 2

        int number = 17;

        System.out.println(number % 2);

        // Vad blir Resultate?: 1
        // Vad händer om numret ändras till 18?: Vi får ett annat resultat: 17.
        // Vad kan % 2 användas till?

        // DEL 3

        int age = 20;

        boolean test1 = age > 18;
        boolean test2 = age < 18;
        boolean test3 = age == 20;
        boolean test4 = age != 20;

        System.out.println(test1);
        System.out.println(test2);
        System.out.println(test3);
        System.out.println(test4);

        boolean hasTicket = true;
        boolean isAdult = true;

        // True
        boolean allowed = hasTicket && isAdult;
        boolean notAllowed = !hasTicket && !isAdult;
        boolean isOldEnough = !hasTicket || isAdult;

        System.out.println("Allowed to enter the stadium?: " + allowed);
        System.out.println("Allowed to enter the stadium?: " + notAllowed);
        System.out.println("Are they old enough?: " + isOldEnough);

    }

}
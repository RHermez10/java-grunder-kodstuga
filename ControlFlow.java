public class ControlFlow {
    public static void main(String[] args) {
        int a = 12;
        int age = 18;
        int b = 17;

        // IF
        if (a > 10) {
            System.out.println("Your number is bigger than 10");
        }

        // IF ELSE

        if (age == 18) {
            System.out.println("You are 18");
        } else {
            System.out.println("You are older");
        }

        // ELSE IF

        if (b > 10) {
            System.out.println("This number is higher than 10");
        } else if (b < 10) {
            System.out.println("This number is lower than 10 ");
        } else {
            System.out.println("Your number is equal to 10");
        }

        // SWITCH

        int number = 2;

        switch (number) {
            case 1:
                System.out.println("This is number 1");
                break;

            case 2:
                System.out.println("This is number 2");
                break;

            case 3:
                System.out.println("This is number 3");
                break;
        }

        int i = 1;
        // while loop

        while (i < 5) {
            System.out.println(i);
            i++;
        }

        // DO WHILE
        do {
            System.out.println(i);
            i++;
        } while (i < 5);

        // FOR LOOP

        for (i = 1; i < 11; i++) {
            System.out.println(i);
        }

        // BREAK

        for (i = 1; i < 11; i++) {

            if (i == 7) {
                break;
            }
            System.out.println(i);
        }

        // CONTINUE
        for (i = 1; i < 11; i++) {

            if (i == 7) {
                continue;
            }
            System.out.println(i);
        }
    }
}
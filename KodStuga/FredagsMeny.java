package KodStuga;

public class FredagsMeny {
    public static void main(String[] args) {

        int meal = 3;

        switch (meal) {
            case 1:
                System.out.println("Chesseburger");
                break;
            case 2:
                System.out.println("Kebab Pizza");
                break;
            case 3:
                System.out.println("Pasta Carbonara");
                break;
            case 4:
                System.out.println("Korean bbq");
                break;

            default:
                System.out.println("Choose a different meny");
        }

    }

}

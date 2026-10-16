package Fridays;

public class CountPrice {

    public static void main(String[] args) {

        int totalPrice = countPrice(5, 15);

        System.out.println(totalPrice);
        System.out.println(fastPrice(3));
    }

    static int countPrice(int sweets, int price) {
        return sweets * price;
    };

    // FAST PRIS
    static int fastPrice(int sweets) {
        return sweets * 2;
    }
}

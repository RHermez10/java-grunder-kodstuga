package Monday;

public class Tree {
    public static void main(String[] args) {
        Oak newOak = new Oak(130.6);
        Pine newPine = new Pine(170.4);

        newOak.describe();
        newPine.describe();
    }

}

abstract class Trees {

    double height;

    Trees(double height) {
        this.height = height;
    }

    abstract void describe();
}

class Oak extends Trees {

    Oak(double height) {
        super(height);
    }

    @Override
    void describe() {

        System.out.println("Oak is: " + height + "cm");
    }

}

class Pine extends Trees {

    Pine(double height) {
        super(height);
    }

    @Override
    void describe() {
        System.out.println("Pine is: " + height + "cm");
    }

}

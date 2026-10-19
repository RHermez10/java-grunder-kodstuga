package Monday;

public class Fordon {
    public static void main(String[] args) {
        Car newCar = new Car();
        Bicycle newBicycle = new Bicycle();
        Scooter newScooter = new Scooter();

        newCar.drive();
        newBicycle.drive();
        startTrip(newCar);
        startTrip(newBicycle);

        newScooter.drive();
    }

    public static void startTrip(Drivable vechile) {
        vechile.drive();
    }

}

interface Drivable {
    void drive();
}

class Car implements Drivable {

    public void drive() {
        System.out.println("Driving the car");
    }

}

class Bicycle implements Drivable {
    public void drive() {
        System.out.println("Riding the bicycle");

    }
}

class Scooter implements Drivable {

    public void drive() {
        System.out.println("Riding the scooter");
    }

}

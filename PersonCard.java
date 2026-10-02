public class PersonCard {
    public static void main(String[] args) {
        // Creating Variables

        String firstName = "Marta";
        String lastName = "Hernandez";
        int age = 29;
        double height = 163.3;
        char grade = 'B';
        boolean likesJava = true;

        // Printing output

        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Grade: " + grade);
        System.out.println("Likes Java: " + likesJava);

        // DEL 2
        // Creating a Variabel and counting next years age

        int ageNextYear = age + 1;
        System.out.println("Next year Marta is " + ageNextYear + ".");

        // DEL 3
        // Improve Variables name

        String CarBrand = "Volvo";
        int yearModel = 2022;
        double price = 185000;
        boolean isAutomatic = true;

        System.out.println("Car brand: " + CarBrand);
        System.out.println("Year model " + yearModel);
        System.out.println("Price: " + price);
        System.out.println("Automatic car: " + isAutomatic);

    }
}
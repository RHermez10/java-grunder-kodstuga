public class StringWorkshop {
    public static void main(String[] args) {

        String firstName = "Marta";
        String lastName = "Hernandez";

        String fullName = firstName + " " + lastName;

        System.out.println(fullName);
        System.out.println(fullName.length());

        System.out.println("Hell0, my name is " + fullName + ".");
        System.out.println("My name contains " + fullName.length() + " " + "characters" + ".");

        String city = "Göteborg";
        String profession = "Mjukvarutestare";

        System.out.println(fullName + " lives in " + city + " and is studying " + profession + ".");
    }
}
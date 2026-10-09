package KodStuga;

public class Djur {

    String name;
    int age;
    String sound;

    Djur(String name, int age, String sound) {
        this.name = name;
        this.age = age;
        this.sound = sound;
    }

    void gorLjud() {
        System.out.println(sound);

    }
}

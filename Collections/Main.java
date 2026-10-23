package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {

        Queue<String> ko = new LinkedList<>();

        ko.offer("Kim");
        ko.offer("Alex");
        ko.offer("Kim");
        System.out.println(ko.peek());
        System.out.println(ko.poll());
        System.out.println(ko.size());
        System.out.println(ko);

        // 1. kim 2. kim and removes it 3. 3 4. kim, alex, kim

        // Correction: kim 2. kim and removes it. 3. 2. 4. alex, kim

        // ÖVNING 3

        Queue<String> newKo = new LinkedList<>();

        newKo.offer("Kim");
        newKo.offer("Alex");
        newKo.offer("Kim");
        newKo.offer("Marta");

        System.out.println("Den som står först: " + newKo.peek());

        // Bertjäna 2 pers

        newKo.poll();
        newKo.poll();

        System.out.println("Personer kvar: " + newKo);

        cafe();
    }

    public static void cafe() {
        HashSet<String> cafe = new HashSet<>();
        cafe.add("Marta");
        cafe.add("Leaon");
        cafe.add("Marta");
        cafe.add("Ronaldo");

        System.out.println(cafe);

        List<Integer> newCafe = new ArrayList<>();
        newCafe.add(50);
        newCafe.add(10);
        newCafe.add(48);
        newCafe.add(20);

        System.out.println("Points for cafe" + newCafe);

        Collections.sort(newCafe);

        System.out.println("Sorted points" + newCafe);
    }

}
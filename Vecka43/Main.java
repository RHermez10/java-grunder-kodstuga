package Vecka43;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Dragon dragon = new Dragon();
        Robot robot = new Robot();
        Slime slime = new Slime();

        List<Monster> monsterList = new ArrayList<>();
        monsterList.add(dragon);
        monsterList.add(robot);
        monsterList.add(slime);

        Collections.shuffle(monsterList);

        System.out.println("--- MONSTER I ARENAN ---");
        for (Monster monster : monsterList) {
            System.out.println(
                    monster.getName() + " - HP: " + monster.getHealth());
        }

        Set<String> monsterTypes = new HashSet<>();

        for (Monster monster : monsterList) {
            monsterTypes.add(monster.getClass().getSimpleName());
        }

        System.out.println("Upptäckta typer: " + monsterTypes);

        Map<String, Integer> toppListan = new HashMap<>();

        for (Monster monster : monsterList) {
            toppListan.put(monster.getName(), 0);
        }

        Monster first = monsterList.get(0);
        Monster second = monsterList.get(1);

        System.out.println("\n--- MATCH STARTAR ---");
        System.out.println(first.getName() + " mot " + second.getName());

        Queue<Monster> ko = new LinkedList<>();
        ko.offer(first);
        ko.offer(second);

        while (first.getHealth() > 0 && second.getHealth() > 0) {
            Monster monsterAttack = ko.poll();
            Monster monsterDamage = (monsterAttack == first) ? second : first;

            int damage = monsterAttack.attack();
            monsterDamage.takeDamage(damage);

            System.out.println(monsterAttack.getName() + " gör " + damage + " skada. " + monsterDamage.getName()
                    + " har " + monsterDamage.getHealth()
                    + " HP kvar.");

            if (monsterDamage.getHealth() > 0) {
                ko.offer(monsterAttack);
            }
        }
        Monster winner = first.getHealth() > 0 ? first : second;

        System.out.println("\nVinnare: " + winner.getName());

        toppListan.put(
                winner.getName(),
                toppListan.get(winner.getName()) + 3);

        System.out.println("\n--- TOPPLISTA ---");

        for (String name : toppListan.keySet()) {
            System.out.println(name + ": " + toppListan.get(name) + " poäng");
        }
    }
}
package home_work.hw_42;

import java.util.Arrays;
import java.util.Comparator;

public class ScoreComporatorApp {

    public static void main(String[] args) {

        Sportsman[] sportsmen = {
                new Sportsman("Teo", 25, 90),
                new Sportsman("David", 30, 85),
                new Sportsman("Elli", 22, 95),
                new Sportsman("Kim", 28, 80)

        };
        Sportsman[] sportsmenByName = sportsmen.clone();
        Arrays.sort(sportsmenByName);
        System.out.println("Sorted by name: ");
        for (Sportsman sportsman : sportsmenByName) {
            System.out.println(sportsman);
        }
        Sportsman[] sportsmenByScore = sportsmen.clone();
        Arrays.sort(sportsmenByScore, new ScoreComparator());
        System.out.println("\nSorted by score: ");
        for (Sportsman sportsman : sportsmenByScore) {
            System.out.println(sportsman);
        }
        Sportsman[] sportsmenByAge = sportsmen.clone();
        Arrays.sort(sportsmenByAge, new Comparator<Sportsman>() {
            @Override
            public int compare(Sportsman s1, Sportsman s2) {
                return Integer.compare(s1.age, s2.age);
            }
        });
        System.out.println("\nSorted by age: ");
        for (Sportsman sportsman : sportsmenByAge) {
            System.out.println(sportsman);
        }

    }
}

package home_work.hw_47_Task_3;

import java.util.List;
import java.util.stream.Collectors;

public class PersonFilter {

    public static class Person {
        private String name;
        private int age;
        private String city;

        public Person(String name, int age, String city) {
            this.name = name;
            this.age = age;
            this.city = city;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public String getCity() {
            return city;
        }

        @Override
        public String toString() {
            return "Person {" +
                    "name = '" + name + '\'' +
                    ", age = " + age +
                    ", city = '" + city + '\'' +
                    '}';
        }
    }
    public static List<Person> filterPerson(List<Person> people, int minAge, String targetCity) {
        return people.stream()
                .filter(person -> person.getAge() > minAge)
                .filter(person -> person.getCity().equals(targetCity))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {

        List<Person> people = List.of(
                new Person("Alice", 30, "Berlin"),
                new Person("Bob", 22, "Hamburg"),
                new Person("Charlie", 28, "Berlin"),
                new Person("Eve", 26, "Munich"),
                new Person("David", 35, "Berlin")
        );
        int minAge = 25;
        String targetCity = "Berlin";

        List<Person> filteredPeople = filterPerson(people, minAge, targetCity);

        System.out.println("\nOriginal list: \n");
        people.forEach(System.out::println);

        System.out.println("\n=================================\n");

        System.out.println("Filtered list of people (over " + minAge + " years old and from the city '" + targetCity + "'):\n");

        filteredPeople.forEach(System.out::println);
    }
}

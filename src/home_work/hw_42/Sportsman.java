package home_work.hw_42;

public class Sportsman implements Comparable<Sportsman> {

    String name;
    int age;
    int score;

    public Sportsman(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    @Override
    public int compareTo(Sportsman other) {
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return "Sportsman{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", score='" + score + '\'' +
                '}';
    }
}

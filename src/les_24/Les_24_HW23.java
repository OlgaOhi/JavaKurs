package les_24;

public class Les_24_HW23 {

    private String name;
    private int age;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Les_24_HW23(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;

    }

    public void info() {
        System.out.println("Employee name: %s, age: %d, salary: %.2f\n");
    }
}

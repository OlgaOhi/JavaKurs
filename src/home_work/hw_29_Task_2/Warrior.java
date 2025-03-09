package home_work.hw_29_Task_2;

public class Warrior extends GameCharacter {
    public Warrior(String name) {
        super(name);
    }

    @Override
    public void attack() {

        System.out.println(getName() + " attacks with a sword !");
    }
}

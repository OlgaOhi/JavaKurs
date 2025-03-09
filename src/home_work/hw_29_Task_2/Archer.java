package home_work.hw_29_Task_2;

public class Archer extends GameCharacter {
    public Archer(String name) {
        super(name);
    }

    @Override
    public void attack() {

        System.out.println(getName() + " shoots an arrow !");
    }
}

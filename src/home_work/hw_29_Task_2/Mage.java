package home_work.hw_29_Task_2;

public class Mage extends GameCharacter {
    public Mage(String name) {
        super(name);
    }

    @Override
    public void attack() {

        System.out.println(getName() + " casts a magic spell !");
    }
}

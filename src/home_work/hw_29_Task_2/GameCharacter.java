package home_work.hw_29_Task_2;

public abstract class GameCharacter {
    private String name;

    public GameCharacter(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public abstract void attack();
}

package home_work.hw_29_Task_2;

public class Main {
    public static void main(String[] args) {

        GameCharacter[] characters = {
                new Warrior("Tor"),
                new Mage("Dambldor"),
                new Archer("Robin Gud")
        };
        for (GameCharacter character : characters) {
            character.attack();
        }
    }
}

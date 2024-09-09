package EnumLearn;

public class EnumLearn {

    public enum Monster {
        ZOMBIE, VAMPIRE, DEMON, WEREWOLF
    }

    public static void main(String[] args) {
        // Example usage of the enum
        Monster myMonster = Monster.ZOMBIE;
        System.out.println("My monster is: " + myMonster);
    }
}
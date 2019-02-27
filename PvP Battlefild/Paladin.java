import java.util.Random;

public class Paladin extends PlayerCharacter{

    int wisdom;
    int constitution;

    public Paladin(String newName){
        name = newName;
        System.out.println("A mage named " + name + " has just been created!");

        Random rand = new Random();

        strength = 10 + (rand.nextInt(5)+1);
        intelligence = 15 + (rand.nextInt(5)+1);
        agility = 5 + (rand.nextInt(5)+1);
        wisdom = 10 + (rand.nextInt(5)+1);
        constitution = 10 + (rand.nextInt(5)+1);

        hp = hpmax = strength + 2*constitution;
        mp = mpmax = intelligence + 2*wisdom;
    }

    public void showstats() {
        System.out.printf("%s, a Paladin:\n", name);
        System.out.printf("STR: %3d    INT: %3d    AGI: %3d    WIS: %3d    CON: %3d\n", strength, intelligence, agility, wisdom, constitution);
        System.out.printf(" HP: %3d/%3d\n", hp, hpmax);
        System.out.printf(" MP: %3d/%3d\n\n",mp, mpmax);
    }
}

import java.util.Random;

public class Mage extends PlayerCharacter{

    private int wisdom;

    public Mage(String newName){
        name = newName;
        System.out.println("A mage named " + name + " has just been created!");

        Random rand = new Random();

        strength = 7 + (rand.nextInt(5)+1);
        intelligence = 15 + (rand.nextInt(5)+1);
        agility = 8 + (rand.nextInt(5)+1);
        wisdom = 10 + (rand.nextInt(5)+1);

        hp = hpmax = strength;
        mp = mpmax = intelligence + 2*wisdom;
    }

   public void showStats() {
        System.out.printf("%s, a Mage:\n", name);
        System.out.printf("WIS: %3d \n", wisdom);
        super.showStats();
    }
}

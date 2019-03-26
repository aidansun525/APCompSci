import java.util.Random;

public class Paladin extends PlayerCharacter{

    private int wisdom;
    private int constitution;

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

   public void showStats() {
        System.out.printf("%s, a Paladin:\n", name);
        System.out.printf("CON: %3d \n WIS: %3d \n", constitution, wisdom);
        super.showStats();
    }
}

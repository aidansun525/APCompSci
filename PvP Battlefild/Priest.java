import java.util.Random;

public class Priest extends PlayerCharacter{

    int charisma;

    public Priest(String newName){
        name = newName;
        System.out.println("A priest named " + name + " has just been created!");

        Random rand = new Random();

        strength = 7 + (rand.nextInt(5)+1);
        intelligence = 15 + (rand.nextInt(5)+1);
        agility = 8 + (rand.nextInt(5)+1);
        charisma = 10 + (rand.nextInt(5)+1);

        hp = hpmax = strength;
        mp = mpmax = intelligence + 2*(charisma);
    }

   public void showStats() {
        System.out.printf("%s, a Priest:\n", name);
        System.out.printf("CHA: %3d \n", charisma);
        super.showStats();
    }
}

import java.util.Random;

public class Fighter extends PlayerCharacter{

    int constitution;

    public Fighter(String newName){
        name = newName;
        System.out.println("A fighter named " + name + " has just been created!");

        Random rand = new Random();

        strength = 15 + (rand.nextInt(5)+1);
        intelligence = 7 + (rand.nextInt(5)+1);
        agility = 8 + (rand.nextInt(5)+1);
        constitution = 10 + (rand.nextInt(5)+1);

        hp = hpmax = (strength * 2) + (constitution * 2);
        mp = mpmax = 0;
    }

   public void showStats() {
        System.out.printf("%s, a Fighter:\n", name);
        System.out.printf("CON: %3d \n", constitution);
        super.showStats();
    }

}

public class PlayerCharacter {

    protected int strength;
    protected int intelligence;
    protected int agility;

    int hp, hpmax;
    int mp, mpmax;
    
    
 private static int count;

 public PlayerCharacter() {
        count++;
    }
 public void showStats() {
     System.out.printf(" HP: %3d/%3d\n", hp, hpmax);
     System.out.printf(" MP: %3d/%3d\n", mp, mpmax);
     System.out.printf("STR: %3d\nINT: %3d\nAGI: %3d\n\n",strength,intelligence,agility);
 }
    
 public static int numCharacters() {
     return count;
    }
}

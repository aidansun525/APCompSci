import java.util.Random;

public class Main {

    public static void main(String[] args) {
        
        Random num = new Random();

        Fighter player = new Fighter("f");
        player.showStats();
        
        System.out.println("There are, "+PlayerCharacter.numCharacters()+" characters\n");

        Priest player2 = new Priest("pr");
        player2.showStats();
        
        System.out.println("There are, "+PlayerCharacter.numCharacters()+" characters\n");

        Mage player3 = new Mage("m");
        player3.showstats();
        
        System.out.println("There are, "+PlayerCharacter.numCharacters()+" characters\n");

        Paladin player4 = new Paladin("pa");
        player4.showstats();
        
        System.out.println("There are, "+PlayerCharacter.numCharacters()+" characters\n");

        ArrayList<PlayerCharacter> players = new ArrayList<PlayerCharacter>();
        players.add(new Fighter ("f"));
        players.add(new Paladin("pa"));
        players.add(new Priest("pr"));
        players.add(new Mage("m"));

    }
}

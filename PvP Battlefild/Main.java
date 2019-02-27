import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int val = 5;
        Random num = new Random();

        Fighter player = new Fighter("f");
        player.showStats();

        Priest player2 = new Priest("pr");
        player2.showStats();

        Mage player3 = new Mage("m");
        player3.showstats();

        Paladin player4 = new Paladin("pa");
        player4.showstats();

        PlayerCharacter playerx = new PlayerCharacter(); 

    }
}

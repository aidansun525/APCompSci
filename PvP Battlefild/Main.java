import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<PlayerCharacter> players = new ArrayList<PlayerCharacter>();
        players.add(new Fighter("Apple"));
        players.add(new Priest("Banana"));
        players.add(new Paladin("Coconut"));
        players.add(new Mage("Durian"));

        System.out.println(players.size());

        for (PlayerCharacter x : players) {
            if (x instanceof Priest){
                System.out.println("Here is a Priest.");
                x.showStats();
            }
        }

    }
}

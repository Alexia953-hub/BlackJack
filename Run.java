import java.util.ArrayList;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Deck deck = new Deck();
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many players?");
        int playersNum = scanner.nextInt();
        

        
        
        ArrayList<Player> players = new ArrayList<>();
        
        for ( int i = 1; i <= playersNum; i++)
        {
            Scanner scannerNames = new Scanner(System.in);
            System.out.println("What is player " + i + "name?");
            String playerName = scannerNames.nextLine();

            Player player = new Player(playerName);
            players.add(player);
            
            player.hit(deck);
            player.hit(deck);

        }

        for (int i = 0; i <= players.size(); i++)
        {
            
        }


        
        
        // for(Card card : deck.getCards())
        // {
        //     System.out.println(card);
        // }
    }
}

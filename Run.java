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

        }
        Dealer superCoolDealer = new Dealer();
        boolean gameHappening = true;
        while (gameHappening = true)
        {
            superCoolDealer.dealerHit(deck);
            superCoolDealer.dealerHit(deck);

            for (Player player: players)
            {
                player.setBet();
                player.hit(deck);
                player.hit(deck);
            }
        }
       
        for (Player player : players)
        {
           player.playTurn(deck);
           player.handleBet(superCoolDealer.get(dealerHandVal()));
    
        }
        gameHappening = false;
        }


        
        
        // for(Card card : deck.getCards())
        // {
        //     System.out.println(card);
        // }
    }
}

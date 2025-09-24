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
            superCoolDealer.firstDealerHit(deck);
            superCoolDealer.dealerHit2nd(deck);
            System.out.println("hi");


            for (Player player: players)
            {
                player.setBet();
                System.out.println("hi");
                player.hit(deck);
                // System.out.println("player" + player + "has value" + player.getHandValue());
                player.hit(deck);
                // System.out.println("player" + player + "has value" + player.getHandValue());
            }

        
        superCoolDealer.dealerTurn(deck);
        for (Player player : players)
        {
           System.out.println("hi");
            player.playTurn(deck);
    
        }
        superCoolDealer.dealerTurn(deck);

        for (Player player : players)
        {
            player.handleBet(superCoolDealer.dealerHandVal());
            if (player.getMoney() == 0)
            {
                gameHappening = false;
            }
            else
            {
                 Scanner scannerPlayer = new Scanner(System.in);
            System.out.println("want to keep playing? y/n");
            String playerChoice = scannerPlayer.nextLine();
            playerChoice.toLowerCase();
            if (playerChoice.equals("n"))
            {
                gameHappening = false;
            }
            }
        }
        
        }


        
        
        // for(Card card : deck.getCards())
        // {
        //     System.out.println(card);
        // }
    }
}


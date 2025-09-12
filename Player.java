import java.util.ArrayList;
import java.util.Scanner;

public class Player
{
    private String name;
    private double money;
    private ArrayList<Card> hand = new ArrayList<>();

    public Player(String name)
    {
        this.name = name;
        this.money = 100;
    }

    public void playTurn(Deck deck)
    {
        Scanner scannerTurn = new Scanner(System.in);
        System.out.println("hit or stay?");
        String userInput = scannerTurn.nextLine();
        userInput.toLowerCase();

        if (userInput == "hit")
        {
            this.hit(deck);
        }
        else
        {
            return;

        }

    }

    public void hit(Deck deck)
    {
        Card newCard = deck.getTopCard();
        this.hand.add(newCard);
    }

    public int getHandValue()
    {
        int totalValue = 0;
        int aceCount = 0;
        for(Card card : hand)
        {
            int carValue = card.getCardValue();
            totalValue =+ carValue;
            if (carValue == 11)
            {
                aceCount++;
            }
        }
        while (aceCount > 0)
        {
            if (totalValue > 21)
            {
              totalValue = totalValue - 10;
              aceCount --;
              
            }
            else
            {
                aceCount = 0;
            }
        
            
        }
        return totalValue;
        
    }

    public void getCard(Deck deck)
    {
        //do stuff
    }
}
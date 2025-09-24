import java.util.ArrayList;
import java.util.Scanner;

public class Player
{
    private String name;
    private double money;
    private double bet;
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
            if (this.getHandValue() > 21)
            {
                return;
            }
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

    public double getMoney()
    {
       return this.money;
    }

    public void setBet()
    {
        boolean bet = false;
        while (bet == false)
        {
        Scanner betterR = new Scanner(System.in);
        System.out.println("bet? you have " + money);
        Double bet2 = betterR.nextDouble();
        betterR.nextLine();

        if (bet2 <= this.money)
        {
            this.bet = bet2;
            break;
        }
        else
        {
            System.out.println("this is invalid what are you doing");
            System.out.println("press that enter key");
            betterR.nextLine();
        }
        }
    }

    public void handleBet(int dealerHandVal)
    {
        if (getHandValue() > 21)
        {
            System.out.println("you suck");
            this.money = money-this.bet;

        }
        else if (getHandValue() == dealerHandVal)
        {
            System.out.println("tie");
        }
        else if (getHandValue() == 21)
        {
            System.out.println("only took you a few tries to win");
            this.bet = bet * 1.5;
            this.money += this.bet;
        }

        else if (getHandValue() < dealerHandVal)
        {
             System.out.println("you suck");
             this.money -= this.bet;
        }

        else
        {
            System.out.println("you won!!!");
            this.money += this.bet;
        }
        System.out.println("you have this" + this.money + "much money left");
    }
}
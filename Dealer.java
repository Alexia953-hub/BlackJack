import java.util.ArrayList;

import javax.print.attribute.Size2DSyntax;

public class Dealer extends Player

{
    private ArrayList<Card> dealerHand = new ArrayList<>();
    
    public Dealer()
    {
        super("Robert");
    }

    public void firstDealerHit(Deck deck)
    {
        Card newCard = deck.getTopCard();
        this.dealerHand.add(newCard);


    }
    



    public void dealerHit(Deck deck)
    {
        Card newCard = deck.getTopCard();
        this.dealerHand.add(newCard);
        System.out.println(dealerHand);
    }

    public void dealerHit2nd(Deck deck)
    {
        Card newCard = deck.getTopCard();
        this.dealerHand.add(newCard);
        System.out.println("the dealer is showing" + newCard);
    }

    public int dealerHandVal()
    {
         int totalValue = 0;
        int aceCount = 0;
        for(Card card : dealerHand)
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


    public boolean haveAces()
    {
         int totalValue = 0;
        int aceCount = 0;
        for(Card card : dealerHand)
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
                return false;
                
                }
            else
                {
                    return true;
                }
            }
            return false;
    }

    

    public void dealerTurn(Deck deck)
    {
        while (dealerHandVal()< 17 || dealerHandVal() == 17 && haveAces() == true)
        {
            dealerHit(deck);
        }

    
    }

}
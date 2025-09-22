import java.util.ArrayList;

import javax.print.attribute.Size2DSyntax;

public class Dealer extends Player

{
    private ArrayList<Card> dealerHand = new ArrayList<>();
    public Dealer()
    {
        super("Robert");
    }



    public void dealerHit(Deck deck)
    {
        Card newCard = deck.getTopCard();
        this.dealerHand.add(newCard);
        if (dealerHand.size() == 1)
        {
            System.out.println(" ");
        }
        else
        {
            for(int i = 1; i <= dealerHand.size(); i++)
            {
                System.out.println(dealerHand.get(i));
            }
        }
        
    }


}
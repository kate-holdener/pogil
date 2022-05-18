import java.util.ArrayList;
import java.util.Random;

public class Deck
{
   private ArrayList<Card> cards;
   Random randomizer;

   public Deck()
   {
     cards = new ArrayList<Card>();

     for (Card.Face face: Card.Face.values())
     {
         cards.add(new Card(face, Card.Suite.SPADES));
         cards.add(new Card(face, Card.Suite.HEARTS));
         cards.add(new Card(face, Card.Suite.CLUBS));
         cards.add(new Card(face, Card.Suite.DIAMONDS));
     }

     randomizer = new Random();
   }

   /**
    * Shuffles the deck in random order 
    */
   public void shuffle()
   {
       for (int i = 0; i < cards.size(); i++)
       {
           int swap_with = randomizer.nextInt(cards.size());
           Card a = cards.get(i);
           cards.set(i, cards.get(swap_with));
           cards.set(swap_with, a);
       }
   }

   /**
    * Retrieves the top card from the deck, removing it from the deck
    * @param p the player who gets one card from the top of the deck
    * @return the top Card from the deck
    */
   public Card getTopCard()
   {
       Card c = cards.remove(cards.size()-1);
       return c;
   }

}

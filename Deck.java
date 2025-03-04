import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import javax.smartcardio.Card;
public class Deck {
    private ArrayList<Cards> deck;
    public Deck(){
        createDeck();
    }
    public void createDeck(){
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks={"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        deck = new ArrayList<>();
        for (String suit:suits){
            for (String rank:ranks){
                deck.add(new Cards(suit, rank));
            }
        }
    }
     public void printDeck() {
        for (Cards card : deck) {
            card.printCard();
        }
    }
    public boolean findCard(String rank, String suit){
        for (Cards card : deck){
            if (card.getRank().equalsIgnoreCase(rank) && card.getSuit().equalsIgnoreCase(suit)) {
                System.out.println("Card found: " + rank + " of " + suit);
                return true;
            }
        }
        System.out.println("Card not found!");
        return false;
    }
    public void dealCard(){
        Random rand = new Random();
        System.out.println("Dealing 5 random cards:");
        for (int i = 0; i < 5; i++) {
            int index = rand.nextInt(deck.size());
            deck.get(index).printCard();
        }
    }

}

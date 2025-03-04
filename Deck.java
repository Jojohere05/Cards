import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
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
}

//import javax.smartcardio.Card;

public class Cards {
    private String suit;
    private String rank;
    public Cards(String suits,String rank){
        this.suit=suits;
        this.rank=rank;
    }
    public String getSuit() {
        return suit;
    }
    public String getRank() {
        return rank;
    }
    public void printCard(){
        System.out.println(rank+" of "+suit);
    }
    public boolean sameCard(Cards other){
        return this.suit.equals(other.suit);
    }
    public boolean compareCard(Cards other){
        return this.rank.equals(other.rank);
    }
    

}

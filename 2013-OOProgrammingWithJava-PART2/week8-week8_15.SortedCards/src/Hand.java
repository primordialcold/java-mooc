import java.util.ArrayList;
import java.util.Collections;

public class Hand implements Comparable<Hand> {

    private ArrayList<Card> cards;

    public Hand(){
        this.cards = new ArrayList<Card>();
    }

    public void add(Card card){
        this.cards.add(card);
    }

    public void print(){
        for(Card card : this.cards){
            System.out.println(card);
        }
    }

    public void sort(){
        Collections.sort(this.cards);
    }

    public void sortAgainstSuit(){
        Collections.sort(this.cards, new SortAgainstSuitAndValue());
    }

    @Override
    public int compareTo(Hand hand){
        int hand1=0;
        int hand2=0;
        for(Card card : this.cards){
            hand1 += card.getValue();
        }
        for(Card card : hand.cards){
            hand2 += card.getValue();
        }
        return hand1 - hand2;
    }

}

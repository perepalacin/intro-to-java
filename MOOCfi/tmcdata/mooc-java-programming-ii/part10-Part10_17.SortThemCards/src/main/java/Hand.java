
import java.util.ArrayList;
import java.util.Collections;

public class Hand implements Comparable<Hand>{

    private ArrayList<Card> cards;

    public Hand() {
        this.cards = new ArrayList<>();
    }

    public void add(Card card) {
        this.cards.add(card);
    }

    public void print(){
        this.cards.forEach(card -> System.out.println(card.toString()));
    }

    public void sort(){
        // this.cards.stream().sorted();
        Collections.sort(this.cards);
    }

    @Override
    public int compareTo(Hand hand) {
        int thisHandValue = 0;
        for (Card card : this.cards) {
            thisHandValue = thisHandValue +  card.getValue();
        }
        int otherHandValue = 0;
        for (Card card : hand.cards) {
            otherHandValue = otherHandValue + card.getValue();
        }
        return thisHandValue - otherHandValue;
    }

    public void sortBySuit(){
        BySuitInValueOrder sortBySuitSorter = new BySuitInValueOrder();
        Collections.sort(cards, sortBySuitSorter);
    }
}

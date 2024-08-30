
import java.util.Comparator;

public class BySuitInValueOrder implements Comparator<Card> {

    @Override
    public int compare(Card c1, Card c2) {
        int suitOrder = c1.getSuit().ordinal() - c2.getSuit().ordinal();
        if (suitOrder == 0) {
            return c1.getValue() - c2.getValue();
        }
        return suitOrder;
    }
    
}

/**
 * Created by Bill on 6/13/18.
 */

import java.util.Comparator;
public class SortAgainstSuitAndValue implements Comparator<Card> {
    public int compare(Card card1, Card card2){
        if(card1.getSuit() - card2.getSuit() == 0){
            return card1.compareTo(card2);
        }
        return card1.getSuit() - card2.getSuit();
    }
}

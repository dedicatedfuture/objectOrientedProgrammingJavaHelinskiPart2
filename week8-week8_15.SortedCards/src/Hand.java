/**
 * Created by Bill on 6/13/18.
 */
import java.util.ArrayList;
import java.util.Collections;

public class Hand implements Comparable<Hand> {

    private ArrayList<Card> currentHand;

    public Hand(){
        currentHand = new ArrayList<Card>();
    }

    public void add(Card card){
        this.currentHand.add(card);
    }

    public void print(){
        for(Card card : this.currentHand){
            System.out.println(card);
        }
    }

    public ArrayList<Card> getCurrentHand(){
        return this.currentHand;
    }

    public void sort(){
        Collections.sort(this.currentHand);
    }

    @Override
    public int compareTo(Hand hand){
        int currentHandTotal = 0;
        int comparingHandTotal = 0;

        for(Card card : this.currentHand){
            currentHandTotal += card.getValue();
        }

        for(Card card : hand.getCurrentHand()){
            comparingHandTotal += card.getValue();
        }

        return currentHandTotal - comparingHandTotal;
    }


    public void sortAgainstSuit(){
        Collections.sort(this.currentHand, new SortAgainstSuitAndValue());
    }
}



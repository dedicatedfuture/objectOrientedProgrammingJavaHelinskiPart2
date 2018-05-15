/**
 * Created by Bill on 1/22/18.
 */
import java.util.ArrayList;
public class Changer {
    private ArrayList<Change> changeArray;

    public Changer(){
        changeArray = new ArrayList<Change>();
    }

    public void addChange(Change change){
        changeArray.add(change);
    }

    public String change(String characterString){
        String changedString = characterString;
        for (Change change : changeArray){
            changedString = change.change(changedString);
        }

        return changedString;
    }
}

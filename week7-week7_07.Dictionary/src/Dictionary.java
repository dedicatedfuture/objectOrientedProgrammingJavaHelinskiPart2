/**
 * Created by Bill on 4/29/18.
 */
import java.util.HashMap;
import java.util.ArrayList;
public class Dictionary {
    private HashMap<String, String> words = new HashMap<String, String>();

    public Dictionary(){
        this.words = new HashMap<String, String>();
    }

    public String translate(String word){
        if (this.words.containsKey(word)){
            return this.words.get(word);
        }
        return null;
    }

    public void add(String word, String translation){
        this.words.put(word, translation);
    }

    public int amountOfWords(){
        return this.words.size();
    }

    public ArrayList<String> translationList(){
        ArrayList<String> translations = new ArrayList<String>();
        for(String key: words.keySet()){
            translations.add(key + " = " + this.words.get(key));
        }
        return translations;
    }

}

package dictionary;

/**
 * Created by Bill on 7/6/18.
 */
import java.util.Set;
import java.util.Map;
import java.util.HashSet;
import java.util.HashMap;
public class PersonalMultipleEntryDictionary implements MultipleEntryDictionary {
    private Map<String, Set<String>> words;

    public PersonalMultipleEntryDictionary(){
        this.words = new HashMap<String, Set<String>>();
    }

    public void add(String word, String entry){
        if(!this.words.containsKey(word)){
            this.words.put(word, new HashSet<String>());
        }

        Set<String> translations = this.words.get(word);
        translations.add(entry);
    }

    public Set<String> translate(String word){

        return this.words.get(word);

    }

    public void remove(String word){
        this.words.remove(word);
    }

}

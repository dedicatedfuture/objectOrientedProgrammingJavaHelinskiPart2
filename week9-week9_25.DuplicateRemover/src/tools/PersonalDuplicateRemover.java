package tools;

import java.util.Set;
import java.util.HashSet;

/**
 * Created by Bill on 7/6/18.
 */
public class PersonalDuplicateRemover implements DuplicateRemover{

    private Set<String> duplicateRemover;
    private int amountOfDuplicates;

    public PersonalDuplicateRemover(){
        this.duplicateRemover = new HashSet<String>();
        this.amountOfDuplicates = 0;
    }
    @Override
    public void add(String characterString) {
        if(this.duplicateRemover.contains(characterString)){
            this.amountOfDuplicates++;
        }
        this.duplicateRemover.add(characterString);
    }

    @Override
    public int getNumberOfDetectedDuplicates() {
        return this.amountOfDuplicates;
    }

    @Override
    public Set<String> getUniqueCharacterStrings() {

        return this.duplicateRemover;
    }

    @Override
    public void empty() {
        this.duplicateRemover.removeAll(duplicateRemover);
        this.amountOfDuplicates = 0;
    }
}

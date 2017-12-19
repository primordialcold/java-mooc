package tools;

import java.util.HashSet;
import java.util.Set;

public class PersonalDuplicateRemover implements DuplicateRemover{

    private Set<String> unikaty;
    private int duplikaty = 0;

    public PersonalDuplicateRemover(){
        this.unikaty = new HashSet<String>();
    }

    public void add(String characterString){
        if(this.unikaty.contains(characterString)){
            this.duplikaty++;
        } else {
            this.unikaty.add(characterString);
        }
    }

    public int getNumberOfDetectedDuplicates(){
        return this.duplikaty;
    }

    public Set<String> getUniqueCharacterStrings(){
        return this.unikaty;
    }

    public void empty(){
        this.unikaty.clear();
        this.duplikaty = 0;
    }
}

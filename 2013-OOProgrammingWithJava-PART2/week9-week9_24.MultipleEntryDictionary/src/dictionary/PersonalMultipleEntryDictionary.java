package dictionary;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PersonalMultipleEntryDictionary implements MultipleEntryDictionary {

    private Map<String, Set<String>> dictionary;

    public PersonalMultipleEntryDictionary(){
        this.dictionary = new HashMap<String, Set<String>>();
    }

    public void add(String word, String entry){
        if(!this.dictionary.containsKey(word)){
            this.dictionary.put(word, new HashSet<String>());
        }
//        Set<String> translation = this.dictionary.get(word);
//        translation.add(entry);
        this.dictionary.get(word).add(entry);
    }

    public Set<String> translate(String word) {
        if(this.dictionary.containsKey(word)){
            return this.dictionary.get(word);
        } else {
            return null;
        }
    }

    public void remove(String word){
        this.dictionary.remove(word);
    }
}

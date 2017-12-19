import java.util.ArrayList;
import java.util.HashMap;

public class Dictionary {

    private HashMap<String, String> slownik;

    public Dictionary(){
        this.slownik = new HashMap<String, String>();
    }

    public String translate(String word){
        if(this.slownik.containsKey(word)){
            return this.slownik.get(word);
        }
        return null;
    }

    public void add(String word, String translation){
        this.slownik.put(word, translation);
    }

    public int amountOfWords(){
        return this.slownik.size();
    }

    public ArrayList<String> translationList(){
        ArrayList<String> tlumaczenia = new ArrayList<String>();
        for(String key : slownik.keySet()){
            tlumaczenia.add(key + " = " + slownik.get(key));
        }
        return tlumaczenia;
    }
}

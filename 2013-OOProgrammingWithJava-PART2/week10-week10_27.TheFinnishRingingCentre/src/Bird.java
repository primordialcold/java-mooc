import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class Bird {

    private String name;
    private String latinName;
    private int ringingYear;
    private Map<String, Integer> birdWatcher = new HashMap<String, Integer>();

    public Bird(String name, String latinName, int ringingYear) {
        this.name = name;
        this.latinName = latinName;
        this.ringingYear = ringingYear;
        this.birdWatcher.put(latinName, ringingYear);
    }

    public String getLatinName(){
        return this.latinName;
    }

    public int getRingingYear(){
        return this.ringingYear;
    }

    @Override
    public String toString() {
        return this.latinName + " (" + this.ringingYear + ")";
    }

    @Override
    public boolean equals(Object object){
        if(object==null){
            return false;
        }

        if(getClass() != object.getClass()){
            return false;
        }

        Bird compared = (Bird) object;

        if(this.ringingYear != compared.ringingYear){
            return false;
        }

        if(this.latinName != compared.latinName){
            return false;
        }

        return true;
    }

    public int hashCode(){
        if(this.name == null){
            return 1;
        }

        return this.ringingYear + this.latinName.hashCode();
    }

}



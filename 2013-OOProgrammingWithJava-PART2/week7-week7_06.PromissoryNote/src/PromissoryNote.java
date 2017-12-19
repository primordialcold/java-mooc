import java.util.HashMap;

public class PromissoryNote {

    private HashMap <String, Double> dlugi;

    public PromissoryNote(){
        this.dlugi = new HashMap<String, Double>();
    }

    public void setLoan(String toWhom, double value){
        this.dlugi.put(toWhom, value);
    }

    public double howMuchIsTheDebt(String whose){
        if(this.dlugi.containsKey(whose)){
            return this.dlugi.get(whose);
        }
        return 0;
    }

}

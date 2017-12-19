import java.util.ArrayList;

public class Container {

    private int limit;
    private int currentWeight = 0;
    private ArrayList<Suitcase> suitcases = new ArrayList<Suitcase>();

    public Container(int limit){
        this.limit = limit;
    }

    public void addSuitcase(Suitcase suitcase){
        if(suitcase.totalWeight() <= this.limit) {
            if(currentWeight + suitcase.totalWeight() <= this.limit){
                suitcases.add(suitcase);
                currentWeight = currentWeight + suitcase.totalWeight();
            }
        }
    }

    public String toString(){
        String string = "empty (0 kg)";
        for (Suitcase suitcase : suitcases) {
            if (suitcases.size() == 0) {
                string = "empty (0 kg)";
            } else if (suitcases.size() == 1) {
                string = "1 suitcase (" + currentWeight + "kg)";
            } else {
                string = suitcases.size() + " suitcases " + "(" + currentWeight + "kg)";
            }
        }
        return string;
    }

    public void printThings(){
        for(Suitcase suitcase : suitcases){
            suitcase.printThings();
        }
    }
}

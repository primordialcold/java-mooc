import java.util.ArrayList;

public class Box implements ToBeStored {

    private double maxWeight;
    private ArrayList<ToBeStored> items;

    public Box(double weight){
        this.maxWeight = weight;
        this.items = new ArrayList<ToBeStored>();
    }

    public void add(ToBeStored item){
        if(item.weight() + this.weight() <= this.maxWeight){
            items.add(item);
        }
    }

    @Override
    public double weight(){
        double weight = 0.0;

        for(ToBeStored item : items){
            weight += item.weight();
        }
        return weight;
    }

    public String toString(){
        return "Box: " + this.items.size() + " things, total weight " + this.weight() + " kg";
    }

}

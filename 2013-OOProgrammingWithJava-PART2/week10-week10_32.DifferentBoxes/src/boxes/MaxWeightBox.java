package boxes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MaxWeightBox extends Box {

    private int maxWeight;
//    private int currentWeight = 0;
    private List<Thing> things;

    public MaxWeightBox(int maxWeight){
        this.maxWeight = maxWeight;
        this.things = new ArrayList<Thing>();
    }

    @Override
    public void add(Thing thing){
        if(thing.getWeight() <= this.maxWeight){
            things.add(thing);
            this.maxWeight -= thing.getWeight();
        }
    }

    @Override
    public boolean isInTheBox(Thing thing){
        if(this.things.contains(thing)){
            return true;
        }
        return false;
    }
}

package moving.domain;

import java.util.ArrayList;

public class Box implements Thing {

    private int maxCapacity;
    private ArrayList<Thing> things;

    public Box(int maxCapacity){
        this.maxCapacity = maxCapacity;
        this.things = new ArrayList<Thing>();
    }

    public boolean addThing(Thing thing){
//        int vol1 = thing.getVolume();
//        int vol2 = getVolume();
//        int vol = vol1 + vol2;
//        if(vol <= this.maxCapacity) {
//            this.things.add(thing);
//            return true;
//        }
//        return false;
        if(this.maxCapacity - this.getVolume() >= thing.getVolume()){
            this.things.add(thing);
            return true;
        } else {
            return false;
        }
    }

    public void whatsInTheBox(){
        for(Thing thing : things){
            System.out.println(thing);
        }
    }

    @Override
    public int getVolume(){
        int currentWeight = 0;
        for(Thing thing : things){
            currentWeight += thing.getVolume();
        }
        return currentWeight;
    }
}

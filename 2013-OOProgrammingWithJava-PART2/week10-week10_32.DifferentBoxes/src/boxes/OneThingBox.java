package boxes;

import java.util.HashSet;
import java.util.Set;

public class OneThingBox extends Box {

    private Set<Thing> things;

    public OneThingBox(){
        this.things = new HashSet<Thing>();
    }

    public void add(Thing thing){
        if(this.things.isEmpty()){
            this.things.add(thing);
        }
    }

    public boolean isInTheBox(Thing thing){
        return this.things.contains(thing);
    }
}

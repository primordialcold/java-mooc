package moving.logic;

import moving.domain.Box;
import moving.domain.Thing;

import java.util.ArrayList;
import java.util.List;

public class Packer {
    private int maxVolume;

    public Packer(int boxesVolume){
        this.maxVolume = boxesVolume;
    }

    public List<Box> packThings(List<Thing> things){
        List<Box> boxes = new ArrayList<Box>();
        Box box = new Box(this.maxVolume);

        for(Thing thing : things) {
            System.out.println("trying");
            if (box.getVolume() + thing.getVolume() <= this.maxVolume) {
                System.out.println("adding");
                box.addThing(thing);
                box.whatsInTheBox();
                System.out.println(box.getVolume());
            } else {
                boxes.add(box);
                System.out.println("adding new box");
                box = new Box(this.maxVolume);
                if (box.getVolume() + thing.getVolume() <= this.maxVolume) {
                    System.out.println("adding");
                    box.addThing(thing);
                    box.whatsInTheBox();
                    System.out.println(box.getVolume());
                }
                boxes.add(box);
            }
        }
        return boxes;
    }
}

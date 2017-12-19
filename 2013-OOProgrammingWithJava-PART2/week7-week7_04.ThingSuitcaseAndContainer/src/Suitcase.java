import java.util.ArrayList;

public class Suitcase {

    private int maxWeight;
    private int currentWeight = 0;
    private ArrayList<Thing> things = new ArrayList<Thing>();

    public Suitcase(int maxweight) {
        this.maxWeight = maxweight;
    }

    public void addThing(Thing thing) {

        if (currentWeight < this.maxWeight) {
            if ((currentWeight + thing.getWeight()) <= this.maxWeight) {
                things.add(thing);
                currentWeight = currentWeight + thing.getWeight();
            }
        }
    }

    public String toString() {
        String string = "empty (0 kg)";
        for (Thing thing : things) {
            if (things.size() == 0) {
                string = "empty (0 kg)";
            } else if (things.size() == 1) {
                string = "1 thing (" + currentWeight + "kg)";
            } else {
                string = things.size() + " things " + "(" + currentWeight + "kg)";
            }
        }
        return string;
    }

    public void printThings() {
        for (Thing thing : things) {
            System.out.println(thing.getName() + " (" + thing.getWeight() + "kg)");
        }
    }

    public int totalWeight() {
        int totalWeight = 0;
        for (Thing thing : things) {
            totalWeight = totalWeight + thing.getWeight();
        }
        return totalWeight;
    }

    public Thing heaviestThing() {
        if (things.size() == 0) {
            return null;
        } else {
            Thing heaviest = new Thing("heaviest", 0);
            for (Thing thing : things) {
                if (heaviest.getWeight() < thing.getWeight()) {
                    heaviest = thing;
                }
            }
            return heaviest;
        }
    }
}

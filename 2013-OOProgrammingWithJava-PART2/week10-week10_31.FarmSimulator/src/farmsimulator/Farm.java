package farmsimulator;

import java.util.LinkedList;

public class Farm implements Alive {

    private String ownerName;
    private Barn barn;
    private LinkedList<Cow> cows;

    public Farm(String name, Barn barn) {
        this.ownerName = name;
        this.barn = barn;
        this.cows = new LinkedList<Cow>();
    }

    public String getOwner() {
        return this.ownerName;
    }

    public void addCow(Cow cow) {
        this.cows.add(cow);
    }

    public void installMilkingRobot(MilkingRobot robot){
        this.barn.installMilkingRobot(robot);
    }

    public void manageCows(){
        this.barn.takeCareOf(cows);
    }

    @Override
    public void liveHour() {
        for(Cow c : cows){
            c.liveHour();
        }
    }

    @Override
    public String toString() {
        String output = "Animals: \n        ";

        if (cows.size() == 0) {
            output = "No cows.";
        } else {
            for (Cow c : cows) {
                output += c.toString() + "\n        ";
            }
        }
        return "Farm owner: " + getOwner() + "\nBarn bulk tank: " + this.barn.getBulkTank().toString() + "\n" + output;
    }
}

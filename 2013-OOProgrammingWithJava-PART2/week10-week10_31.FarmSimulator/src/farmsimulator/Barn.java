package farmsimulator;

import java.util.Collection;

public class Barn {

    private BulkTank tank;
    private MilkingRobot robot;

    public Barn(BulkTank tank){
        this.tank = tank;
    }

    public BulkTank getBulkTank(){
        return this.tank;
    }

    public void installMilkingRobot(MilkingRobot milkingRobot){
        this.robot = new MilkingRobot();
        this.robot.setBulkTank(this.tank);
    }

    public void takeCareOf(Cow cow) {
        try {
            this.robot.milk(cow);
        } catch (Exception e) {
            throw new IllegalStateException("The MilkingRobot hasn't been installed");
        }
    }

    public void takeCareOf(Collection<Cow> cows) {
        if (this.tank == null) {
            throw new IllegalStateException("The MilkingRobot hasn't been installed");
        } else {
            for (Cow c : cows) {
                this.robot.milk(c);
            }
        }
    }

    @Override
    public String toString() {
        return this.tank.toString();
    }
}

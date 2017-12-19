package farmsimulator;

public class MilkingRobot {

    private BulkTank tank;

    public MilkingRobot() {
        this.tank = null;
    }

    public BulkTank getBulkTank() {
//        if (this.tank == null) {
//            throw new IllegalStateException("The MilkingRobot hasn't been installed");
//        }
        return this.tank;
    }

    public void setBulkTank(BulkTank tank){
        this.tank = tank;
    }

    public void milk(Milkable milkable) {
        if (this.tank == null) {
            throw new IllegalStateException("The MilkingRobot hasn't been installed");
        } else {
            double milked = milkable.milk();
            this.tank.addToTank(milked);
        }
    }
}

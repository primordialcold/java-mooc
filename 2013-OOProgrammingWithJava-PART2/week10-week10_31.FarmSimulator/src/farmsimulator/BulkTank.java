package farmsimulator;

public class BulkTank {

    private double capacity;
    private double volume;

    public BulkTank(double capacity){
        this.capacity = capacity;
        this.volume = 0;
    }

    public BulkTank(){
        this.capacity = 2000;
        this.volume = 0.0;
    }

    public double getCapacity(){
        return this.capacity;
    }

    public double getVolume(){
        return this.volume;
    }

    public double howMuchFreeSpace(){
        return getCapacity() - getVolume();
    }

    public void addToTank(double amount) {
        if(amount<0){
            return;
        }

        if (amount <= howMuchFreeSpace()) {
            this.volume += amount;
        } else {
            this.volume = this.capacity;
        }
    }

    public double getFromTank(double amount){
        if(amount < 0){
            return 0.0;
        }

        if(amount > this.volume){
            double taken = this.volume;
            this.volume = 0.0;
            return taken;
        }

        this.volume -= amount;
        return amount;
    }

    public String toString(){
        String volume = "" + Math.ceil(this.volume);
        String capacity = "" + Math.ceil(this.capacity);
        return volume+"/"+capacity;
    }
}

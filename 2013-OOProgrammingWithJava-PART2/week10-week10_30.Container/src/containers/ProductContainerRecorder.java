package containers;

public class ProductContainerRecorder extends ProductContainer {

//    private double initialVolume;
    private ContainerHistory containerHistory;

    public ProductContainerRecorder(String productName, double capacity, double initialVolume){
        super(productName, capacity);
        this.containerHistory = new ContainerHistory();
        this.addToTheContainer(initialVolume);
//        this.containerHistory.add(initialVolume);
    }

    public String history(){
        return this.containerHistory.toString();
    }

    public void addToTheContainer(double amount){
//        if (amount < 0) {
//            return;
//        }
//
//        if (amount <= getCurrentCapacity()) {
//            this.volume = this.volume + amount;
//        } else {
//            this.volume = this.capacity;
//        }
//        this.containerHistory.add(this.volume);

        super.addToTheContainer(amount);
        containerHistory.add(getVolume());
    }

    public double takeFromTheContainer(double amount){
//        if (amount < 0) {
//            return 0.0;
//        }
//        if (amount > volume) {
//            double everything = volume;
//            volume = 0.0;
//            return everything;
//        }
//
//        volume = volume - amount;
//        this.containerHistory.add(this.volume);
//        return amount;

        double output = super.takeFromTheContainer(amount);
        containerHistory.add(getVolume());
        return output;
    }

    public void printAnalysis(){
        System.out.println("Product: " + this.getName());
        System.out.println("History: " + history());
        System.out.println("Greatest product amount: " + containerHistory.maxValue());
        System.out.println("Smallest product amount: " + containerHistory.minValue());
        System.out.println("Average: " + containerHistory.average());
        System.out.println("Greatest change: " + containerHistory.greatestFluctuation());
        System.out.println("Variance: " + containerHistory.variance());
    }
}

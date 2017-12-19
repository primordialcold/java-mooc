public class BoundedCounter {
    private int value;
    private int upperLimit;

    public BoundedCounter(int upperLimit) {
        // write code here
        this.upperLimit = upperLimit;
    }

    public void next() {
        // write code here
        if(value<upperLimit){
            value++;
        } else {
            this.value = 0;
        }
    }

    public String toString() {
        // write code here
        if(this.value<10){
            return "0" + value;
        } else {
            return "" + value;
        }
    }

    public int getValue() {
        // write here code that returns the value
        return this.value;
    }

    public void setValue(int poczatek) {
        if(poczatek >= 0 & poczatek <= upperLimit){
            this.value = poczatek;
        }
    }
}
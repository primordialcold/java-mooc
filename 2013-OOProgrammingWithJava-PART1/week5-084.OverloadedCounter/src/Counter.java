public class Counter {

    private int startingValue = 0;
    private boolean check = false;
    private int value = startingValue;

    public Counter(int startingValue, boolean check) { //creates a new counter with the given value. The check is on if the parameter given to check was true.
        this.value = startingValue;
        if(check) {
            this.check = true;
        } else {
            this.check = false;
        }
    }

    public Counter(int startingValue) { //creates a new counter with the given value. The check on the new counter should be off.
        this.value = startingValue;
    }

    public Counter(boolean check) { //creates a new counter with the starting value 0. The check is on if the parameter given to check was true.
        this.startingValue = 0;
        if(check) {
            this.check = true;
        } else {
            this.check = false;
        }
    }

    public Counter() { //creates a new counter with the starting value of 0 and with checking off.
        this.startingValue = 0;
    }



    public int value() { //returns the current value of the counter
        return this.value;
    }
    public void increase() { //increases the value of the counter by one
        this.increase(1);
    }
    public void increase(int ile) {
        if(ile>0) {
            this.value += ile;
        }
    }

    public void decrease() { //decreases the value of the counter by one, but not below 0 if the check is on
        this.decrease(1);
    }
    public void decrease(int ile) {
        if (ile > 0) {
            if (this.check) {
                this.value -= ile;
                if (this.value < 0) {
                    this.value = 0;
                }
            } else {
                this.value -= ile;
            }
        }
    }
}


public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

    public Money plus(Money added){
        Money addedMoney = new Money (this.euros + added.euros, this.cents + added.cents);
        if(this.cents + added.cents > 99){
            Money addedMoney2 = new Money(this.euros + added.euros + 1,  added.cents - this.cents);
            return addedMoney2;
        }
        return addedMoney;
    }

    public boolean less(Money compared){
        if(this.euros < compared.euros){
            return true;
        } else if(this.euros == compared.euros && this.cents < compared.cents) {
            return true;
        } else {
            return false;
        }
    }

    public Money minus(Money decremented){
        Money decrementedMoney = new Money (this.euros - decremented.euros, this.cents - decremented.cents);
        if(this.less(decremented)){
            Money zeroMoney = new Money(0,0);
            return zeroMoney;
        } else if(this.cents - decremented.cents < 0) {
            Money decrementedMoney2 = new Money(this.euros - decremented.euros - 1, 100 - decremented.cents);
            return decrementedMoney2;
        } else {
            return decrementedMoney;
        }
    }
}

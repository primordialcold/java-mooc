
public class Apartment {

    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }

    public boolean larger (Apartment otherApartment) {
        if(this.squareMeters>otherApartment.squareMeters) {
            return true;
        }
        return false;
    }

    public int priceDifference(Apartment otherApartment){
        int comparison = (this.pricePerSquareMeter * this.squareMeters)-(otherApartment.pricePerSquareMeter * otherApartment.squareMeters);
        if(comparison<0){
            return comparison*(-1);
        }
        return comparison;
    }

    public boolean moreExpensiveThan(Apartment otherApartment){
        int comparison = (this.pricePerSquareMeter * this.squareMeters);
        int compared = (otherApartment.pricePerSquareMeter * otherApartment.squareMeters);

        if(comparison>compared){
            return true;
        }
        return false;
    }
}

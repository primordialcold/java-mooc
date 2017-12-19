public class Plane {

    private String planeID;
    private int capacity;


    public Plane(String name, int capacity){
        this.planeID = name;
        this.capacity = capacity;
    }

    public String getPlaneID(){
        return this.planeID;
    }

    public int getCapacity(){
        return this.capacity;
    }

    public String toString(){
        return this.planeID + " (" + this.capacity + " ppl)";
    }
}

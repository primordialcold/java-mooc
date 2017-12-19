public class Thing {

    private int weight;
    private String name;

    public Thing(String name, int weight){
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return this.name;
    }

    public int getWeight(){
        return this.weight;
    }

    public String toString(){
        return this.getName() + " (" + this.weight  + " kg)";
    }
}

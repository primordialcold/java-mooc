package boxes;

public class Thing {

    private String name;
    private int weight;

    public Thing(String name, int weight) {
        if(weight < 0){
            throw new IllegalArgumentException();
        }
        this.name = name;
        this.weight = weight;
    }

    public Thing(String name) { this(name, 0); }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if(getClass() != obj.getClass()){
            return false;
        }


        Thing compared = (Thing) obj;

//        if(getWeight() != compared.getWeight()){
//            return false;
//        }

        if(this.name == null || compared.name == null || !this.name.equals(compared.name)){
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        if(this.name == null){
            return 7;
        }
        return this.name.hashCode();
    }
}

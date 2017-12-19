public class Reformatory {

    private int totalWeightMeasured = 0;

    public int weight(Person person) {
        // return the weight of the person
        totalWeightMeasured++;
        return person.getWeight();
    }

    public void feed(Person person){
        person.setWeight(person.getWeight()+1);
    }

    public int totalWeightsMeasured(){
        return totalWeightMeasured;
    }
}


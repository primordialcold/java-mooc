package containers;

import java.util.ArrayList;
import java.util.List;

public class ContainerHistory {

    private List<Double> history;

    public ContainerHistory(){
        this.history = new ArrayList<Double>();
    }

    public void add(double situation){
        this.history.add(situation);
    }

    public void reset(){
        this.history.clear();
    }

    public String toString(){
        return this.history.toString();
    }

    public double maxValue(){
        if(this.history.size()==0){
            return 0;
        }

        double maxVal = 0;

        for(double d : this.history) {
            if (d > maxVal) {
                maxVal = d;
            }
        }
        return maxVal;
    }

    public double minValue(){
        if(this.history.size()==0){
            return 0;
        }

        double minVal = this.history.get(0);

        for(double d : this.history) {
            if (d < minVal) {
                minVal = d;
            }
        }
        return minVal;
    }

    public double average(){
        if(this.history.size()==0){
            return 0;
        }

        double sum = 0;

        for(double d : this.history){
            sum += d;
        }
        return sum/this.history.size();
    }

    public double greatestFluctuation() {
        if (this.history.size() == 0) {
            return 0;
        }

        double fluctuation = 0;

        for (int i = 1; i < this.history.size(); i++) {
            if (Math.abs(this.history.get(i - 1) - this.history.get(i)) > fluctuation) {
                fluctuation = Math.abs(this.history.get(i - 1) - this.history.get(i));
            }
        }
        return fluctuation;
    }

    public double variance(){
        if(this.history.size()==0){
            return 0;
        }

        double variance = 0;

        for(double d : this.history){
           variance += Math.pow((d - average()),2);
        }
        return variance/(this.history.size()-1);
    }
}

package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {

    private ArrayList<Sensor> list;
    private List<Integer> readings;

    public AverageSensor(){
        this.list = new ArrayList<Sensor>();
        this.readings = new ArrayList<Integer>();
    }

    public void addSensor(Sensor additional){
        this.list.add(additional);
    }

    @Override
    public boolean isOn() {
//        ArrayList<Boolean> bool = new ArrayList<Boolean>();
//        for(Sensor s : this.list){
//            bool.add(s.isOn());
//        }
//        return bool.get(0);
        for (Sensor s : this.list) {
            if (!s.isOn()) {
                return false;
            }
        }
        return true;
    }

    public List<Integer> readings(){
        return this.readings;
    }

    @Override
    public void on(){
        for(Sensor s : this.list){
            s.on();
        }
    }

    @Override
    public void off(){
        for(Sensor s : this.list){
            s.off();
        }
    }

    @Override
    public int measure(){
        if(isOn()){
            int sum = 0;
            for(Sensor s : this.list){
                sum += s.measure();
            }
            int avg = sum/this.list.size();
            this.readings.add(avg);
            return avg;
        } else {
            throw new IllegalStateException();
        }
    }
}

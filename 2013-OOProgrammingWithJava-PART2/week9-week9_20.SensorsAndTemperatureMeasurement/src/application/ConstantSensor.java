package application;

public class ConstantSensor implements Sensor {

    private int measure;

    public ConstantSensor(int measure){
        this.measure = measure;
    }

    @Override
    public void on(){

    }

    @Override
    public void off(){

    }

    @Override
    public boolean isOn(){
        return true;
    }

    @Override
    public int measure(){
        return this.measure;
    }
}

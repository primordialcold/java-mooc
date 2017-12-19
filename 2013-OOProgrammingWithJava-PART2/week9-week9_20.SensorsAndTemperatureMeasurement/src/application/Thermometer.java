package application;

import java.util.Random;

public class Thermometer implements Sensor {

    private boolean status;
    private Random randomizer;

    public Thermometer(){
        this.status = false;
        this.randomizer = new Random();
    }

    @Override
    public void on(){
        this.status = true;
    }

    @Override
    public void off(){
        this.status = false;
    }

    @Override
    public boolean isOn(){
        return this.status;
    }

    @Override
    public int measure(){
        if(this.status){
            return (randomizer.nextInt(60) - 30);
        } else {
            throw new IllegalStateException();
        }
    }
}

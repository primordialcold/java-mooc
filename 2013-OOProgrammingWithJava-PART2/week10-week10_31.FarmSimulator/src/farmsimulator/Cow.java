package farmsimulator;

import java.util.Random;

public class Cow implements Alive, Milkable {

    private String name;
    private int udderCapacity;
    private double udderVolume = 0.0;
    private static final String[] NAMES = new String[]{
            "Anu", "Arpa", "Essi", "Heluna", "Hely",
            "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",
            "Jaana", "Jami", "Jatta", "Laku", "Liekki",
            "Mainikki", "Mella", "Mimmi", "Naatti",
            "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
            "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};

    public Cow(){
        int num = new Random().nextInt(30);
        this.name = NAMES[num];

        int num2 = 15 + new Random().nextInt(26);
        this.udderCapacity = num2;
    }

    public Cow(String name){
        this.name = name;
        int num = 15 + new Random().nextInt(26);
        this.udderCapacity = num;
    }

    public String getName(){
        return this.name;
    }

    public double getCapacity(){
        return this.udderCapacity;
    }

    public double getAmount(){
        return udderVolume;
    }

    @Override
    public void liveHour() {
        double milk = 0.7 + (2.0 - 0.7) * (new Random().nextDouble());
        if(this.udderVolume + milk > this.udderCapacity) {
            this.udderVolume = this.udderCapacity;
        } else {
            this.udderVolume += milk;
        }
    }

    @Override
    public double milk() {
        double milked = this.udderVolume;
        this.udderVolume = 0;
        return milked;
    }

    @Override
    public String toString() {
        String vol = "" + Math.ceil(getAmount());
        String capa = "" + Math.ceil(getCapacity());
        return this.name + " " + vol + "/" + capa;
    }
}

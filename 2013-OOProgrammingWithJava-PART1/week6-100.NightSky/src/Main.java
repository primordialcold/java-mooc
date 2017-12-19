
public class Main {

    public static void main(String[] args) {
        // Test your code here
//        NightSky NightSky = new NightSky(0.1, 40, 10);
//        NightSky.printLine();

//        NightSky NightSky2 = new NightSky(8, 4);
//        NightSky2.print();

        NightSky NightSky = new NightSky(8, 4);
        NightSky.print();
        System.out.println("Number of stars: " + NightSky.starsInLastPrint());
        System.out.println("");

        NightSky.print();
        System.out.println("Number of stars: " + NightSky.starsInLastPrint());
    }
}

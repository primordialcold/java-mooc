
import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Program your solution here

        System.out.println("Type radius:");
        int radius = Integer.parseInt(reader.nextLine());

        double result = Math.PI * 2 * (double)radius;

        System.out.println("Circumference of the circle: " + result);
    }
}

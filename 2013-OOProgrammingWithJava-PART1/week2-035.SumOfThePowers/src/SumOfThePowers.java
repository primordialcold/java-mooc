
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a number: ");
        int goal = Integer.parseInt(reader.nextLine());

        int x = 0;
        int result = 0;

        while(x<=goal){
            result = result + (int)Math.pow(2,x);
            x++;
        }
        System.out.println("The result is " + result);
    }
}

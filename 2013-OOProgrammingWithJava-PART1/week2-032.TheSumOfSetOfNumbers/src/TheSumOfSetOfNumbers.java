
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int start = 1;
        int sum = 0;

        System.out.println("Until what?");
        int goal = Integer.parseInt(reader.nextLine());

        while(start<=goal){
            sum = sum + start;
            start++;
        }
        System.out.println("Sum is " + sum);
    }
}

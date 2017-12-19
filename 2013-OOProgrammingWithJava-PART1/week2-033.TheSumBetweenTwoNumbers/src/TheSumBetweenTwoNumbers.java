
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("First: ");
        int start = Integer.parseInt(reader.nextLine());
        System.out.println("Last: ");
        int end = Integer.parseInt(reader.nextLine());

        int sum = 0;

        while(start<=end){
            sum = sum + start;
            start++;
        }
        System.out.println("The sum is " + sum);
    }
}

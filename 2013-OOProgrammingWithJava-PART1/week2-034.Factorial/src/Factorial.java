import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a number: ");
        int goal = Integer.parseInt(reader.nextLine());

        int x = 1;
        int sum = 1;

        while (x<=goal){
            sum=sum*x;
            x++;
        }
        System.out.println("Factorial is: " + sum);
    }
}

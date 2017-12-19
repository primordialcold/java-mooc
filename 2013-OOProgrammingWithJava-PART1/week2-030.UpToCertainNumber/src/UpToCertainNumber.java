
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int poczatek = 1;
        // Write your code here

        System.out.println("Up to what number?");
        int goal = Integer.parseInt(reader.nextLine());

        while(poczatek <= goal){
            System.out.println(poczatek);
            poczatek++;
        }
    }
}

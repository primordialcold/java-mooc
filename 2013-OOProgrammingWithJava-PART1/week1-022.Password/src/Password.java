
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot"; // Use carrot as password when running tests.

        // Write your code here

        while(true){
            System.out.println("Type the password: ");
            String input = reader.nextLine();

            if(password.equals(input)) {
                System.out.println("Right!");
                System.out.println("The secret is: jryy qbar!");
                break;
            } else {
                System.out.println("Wrong!");
            }
        }
    }
}

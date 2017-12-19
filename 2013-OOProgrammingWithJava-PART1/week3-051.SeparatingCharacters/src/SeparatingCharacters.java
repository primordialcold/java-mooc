
import java.util.Scanner;

public class SeparatingCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name = reader.nextLine();
        int x = 0;

        while (true) {
            if (x < name.length()) {
                char literka = name.charAt(x);
                System.out.println((x + 1) + ". character: " + literka);
                x++;
            } else {
                break;
            }
        }
    }
}
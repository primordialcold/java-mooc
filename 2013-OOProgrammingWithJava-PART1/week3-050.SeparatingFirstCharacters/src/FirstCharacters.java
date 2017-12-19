import java.util.Scanner;

public class FirstCharacters {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name = reader.next();
        int x = 0;

        while (name.length() > 3) {
            if (x < 3) {
                char literka = name.charAt(0 + x);
                System.out.println((x + 1) + ". character: " + literka);
                x++;
            } else {
                break;
            }
        }
    }
}
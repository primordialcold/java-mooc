import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name = reader.nextLine();
        int x = 0;

        while (true) {
            if (x < name.length()) {
                char literka = name.charAt(name.length()-x-1);
                System.out.print(literka);
                x++;
            } else {
                break;
            }
        }
    }
}
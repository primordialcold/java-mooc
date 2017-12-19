
import java.util.Scanner;

public class ReversingText {

    public static String reverse(String text) {
        // write your code here
        // note that method does now print anything, it RETURNS the reversed string

        int x = 0;
        String help = "";

        while (true) {
            if (x < text.length()) {
                char literka = text.charAt(text.length() - x - 1);
                help = help + literka;
                x++;
            } else {
                break;
            }
        }
        return help;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }
}



//        Hint: you probably need to build the reversed string character by character in your method. You can use a
//        String-type variable as a helper during the building process. In the beginning, the helper variable
//        should have an empty string of characters as a value. After this, new characters are
//        added to the string one by one.
//
//        String help = "";
//
//// ...
//// adding a character to the help variable
//        help = help + character;
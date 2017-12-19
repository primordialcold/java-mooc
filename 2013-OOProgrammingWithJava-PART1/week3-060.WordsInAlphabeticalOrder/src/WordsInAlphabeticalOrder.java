
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInAlphabeticalOrder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here an ArrayList
        ArrayList<String> words = new ArrayList<String>();
        System.out.println("Type a word: ");
        String word = reader.nextLine();

        while (true) {
            if (word.isEmpty()) {
                break;
            } else {
                words.add(word);
                System.out.println("Type a word: ");
                word = reader.nextLine();
            }
        }

        Collections.sort(words);

        for (String slowa : words) {
            System.out.println(slowa);
        }
    }
}
import sun.font.TrueTypeFont;

import java.util.Scanner;

public class TextUserInterface {

    private Scanner reader;
    private Dictionary dictionary;

    public TextUserInterface(Scanner reader, Dictionary dictionary) {
        this.reader = reader;
        this.dictionary = dictionary;
    }

    public void start() {
        System.out.println("Statements:");
        System.out.println(" add - adds a word pair to the dictionary");
        System.out.println(" translate - asks a word and prints its translation");
        System.out.println(" quit - quits the text user interface\n");


        while (true) {
            System.out.println("Statement: ");
            String input = reader.nextLine();

            if (input.equals("add")) {
                add();
            } else if (input.equals("translate")) {
                translate();
            } else if (input.equals("quit")) {
                System.out.println("Cheers!");
                break;
            } else {
                System.out.println("Unknown statement");
            }
        }
    }

    public void add() {
        System.out.println("In Finnish: ");
        String finnishWord = reader.nextLine();
        System.out.println("Translation: ");
        String translation = reader.nextLine();
        this.dictionary.add(finnishWord, translation);
    }

    public void translate() {
        System.out.println("Give a word: ");
        String toTranslate = reader.nextLine();
        System.out.println("Translation: " + this.dictionary.translate(toTranslate));
    }
}
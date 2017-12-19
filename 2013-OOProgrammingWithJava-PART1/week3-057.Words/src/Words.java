import java.util.ArrayList;
import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
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

//        int z = 0;
//        System.out.println("You typed following words:");
//        while(z < words.size()) {
//            System.out.println(words.get(z));
//            z++;
//        }
        for (String slowa : words) {
            System.out.println(slowa);
        }
    }
}

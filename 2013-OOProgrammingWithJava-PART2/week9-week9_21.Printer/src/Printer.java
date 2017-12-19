import java.io.File;
import java.util.Scanner;

public class Printer {

    private File file;
    private Scanner reader;

    public Printer(String filename) throws Exception {
        this.file = new File(filename);
    }

    public void printLinesWhichContain(String word) throws Exception {
        reader = new Scanner(this.file);

        if (!word.isEmpty()) {
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                if (line.contains(word)) {
                    System.out.println(line);
                }
            }
        } else {
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                System.out.println(line);
            }
        }
    }
}

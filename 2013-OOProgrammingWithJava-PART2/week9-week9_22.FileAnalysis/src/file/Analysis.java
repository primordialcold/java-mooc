package file;

import java.io.File;
import java.util.Scanner;

public class Analysis {

    private File file;
    private Scanner reader;

    public Analysis(File file) {
//        if(file==null){
//            throw new
//        }
        this.file = file;
    }

    public int lines() throws Exception {
        reader = new Scanner(this.file);
        int lines = 0;
        while (reader.hasNextLine()) {
            reader.nextLine();
            lines++;
        }
        reader.close();
        return lines;
    }

    public int characters() throws Exception {
        Scanner reader2 = new Scanner(this.file);
        int characters = lines();

        while (reader2.hasNext()) {
            String linia = reader2.useDelimiter("").nextLine();
            characters += linia.length();
        }

        reader2.close();
        return characters;
    }
}

package wordinspection;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordInspection {

    private File file;
    private Scanner reader;

    public WordInspection(File file){
        this.file = file;
    }

    public int wordCount() throws Exception {
        reader = new Scanner(this.file, "UTF-8");
        int lines = 0;
        while (reader.hasNextLine()) {
            reader.nextLine();
            lines++;
        }
        reader.close();
        return lines;
    }

    public List<String> wordsContainingZ() throws Exception {
        reader = new Scanner(this.file, "UTF-8");
        List<String> zetki = new ArrayList<String>();
        while (reader.hasNextLine()) {
            String line = reader.nextLine();
            if (line.contains("z")) {
                zetki.add(line);
            }
        }
        return zetki;
    }

    public List<String> wordsEndingInL() throws Exception{
        reader = new Scanner(this.file, "UTF-8");
        List<String> elki = new ArrayList<String>();
        while (reader.hasNextLine()) {
            String line = reader.nextLine();
            String koniec = "";
            koniec += line.charAt(line.length()-1);
            if (koniec.equals("l")) {
                elki.add(line);
            }
        }
        return elki;
    }

    public List<String> palindromes() throws Exception {
        reader = new Scanner(this.file, "UTF-8");
        List<String> palindromy = new ArrayList<String>();
        while (reader.hasNextLine()) {
            String line = reader.nextLine();
            String reverseLine = reverse(line);
            if (line.equalsIgnoreCase(reverseLine)) {
                palindromy.add(line);
            }
        }
        return palindromy;
    }

    private String reverse(String s){
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        String rev = sb.toString();
        return rev;
    }

    public List<String> wordsWhichContainAllVowels() throws Exception {
        reader = new Scanner(this.file, "UTF-8");
        List<String> allVowels = new ArrayList<String>();
        while (reader.hasNextLine()) {
            String line = reader.nextLine();
            if (line.contains("a") & line.contains("e") & line.contains("i") & line.contains("o") & line.contains("u") & line.contains("y") & line.contains("ä") & line.contains("ö")) {
                allVowels.add(line);
            }
        }
        return allVowels;
    }

}

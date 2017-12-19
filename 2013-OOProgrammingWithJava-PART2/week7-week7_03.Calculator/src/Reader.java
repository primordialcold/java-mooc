import java.util.Scanner;

public class Reader {

    private final Scanner skaner = new Scanner(System.in);

    public String readString(){
        return skaner.nextLine();
    }

    public int readInteger(){
        return Integer.parseInt(skaner.nextLine());
    }

}

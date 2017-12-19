import java.util.Random;

public class PasswordRandomizer {
    // Define the variables
    private Random randomizer = new Random();
    private int length;

    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.length = length;
        randomizer = new Random();
    }

    public String createPassword() {
        // write code that returns a randomized password
        String password = "";
        int i = 0;

        while(true){
            int number = randomizer.nextInt(26);
            char symbol = "abcdefghijklmnopqrstuvwxyz".charAt(number);

            if(i < length){
                password = password + symbol;
                i++;
            } else {
                break;
            }
        }
        return password;
    }
}

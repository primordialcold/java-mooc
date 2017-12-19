import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;

    public LotteryNumbers() {
        // Draw numbers as LotteryNumbers is created
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        // We'll format a list for the numbers
        this.numbers = new ArrayList<Integer>();
        // Write the number drawing here using the method containsNumber()
        int i = 0;
        Random randomizer = new Random();
//        int draw = randomizer.nextInt(39) + 1;

        while (i < 3) {
            int draw = randomizer.nextInt(4) + 1;
            if (!containsNumber(draw)) {
                this.numbers.add(draw);
                i++;
            } else {
                draw = randomizer.nextInt(4) + 1;
            }
        }
    }

    public boolean containsNumber(int number) {
        // Test here if the number is already in the drawn numbers
        return this.numbers.contains(number);
    }
}

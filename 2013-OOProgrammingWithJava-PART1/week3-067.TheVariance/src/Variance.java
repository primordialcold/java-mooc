import java.util.ArrayList;

public class Variance {
    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) {
        int sum = 0;
        for (int numer : list) {
            sum = sum + numer;
        }
        return sum;
    }
    
    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list) {
        double avg = (double)sum(list)/list.size();
        return avg;
    }

    public static double variance(ArrayList<Integer> list) {
        // write code here
        //http://www.alcula.com/calculators/statistics/variance/
        double kwadraty;
        double srednia = average(list);
        double suma = 0.0;
        for (double kwadrat : list) {
            System.out.println(kwadrat);
            kwadraty = (kwadrat - srednia)*(kwadrat - srednia);
            System.out.println(kwadraty);
            suma = suma + kwadraty;
            }
        return suma / (list.size()-1);
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("The variance is: " + variance(list));
    }

}

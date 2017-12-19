import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);

        System.out.println("Type numbers: ");
        int tekst = Integer.parseInt(reader.nextLine());
        int sum = tekst;
        int x = 1;
        int odd = 0;
        int even = 0;

        while(tekst != -1){
            if(tekst%2==0){
                tekst = Integer.parseInt(reader.nextLine());
                sum = sum + tekst;
                x++;
                even++;
            } else {
                tekst = Integer.parseInt(reader.nextLine());
                sum = sum + tekst;
                x++;
                odd++;
            }
        }

        sum = sum + 1;
        x = x - 1;
        float summ = sum;
        float xx = x;
        float avg = summ / xx;
        System.out.println("Thank you and see you later!");
        System.out.println("The sum is " + sum);
        System.out.println("How many numbers: " + x);
        System.out.println("Average: " + avg);
        System.out.println("Even numbers: " +even);
        System.out.println("Odd numbers: " +odd);
    }
}

import java.util.Scanner;

//public class LoopsEndingRemembering {
//    public static void main(String[] args) {
//        // program in this project exercises 36.1-36.5
//        // actually this is just one program that is split in many parts
//
//        Scanner reader = new Scanner(System.in);
//
//        int sum = 0;
//        int numbers = 0;
//        int even = 0;
//
//        System.out.println("Type numbers:");
//        while (true) {
//            int number = Integer.parseInt(reader.nextLine());
//            if (number == -1) {
//                break;
//            }
//
//            sum += number;
//            numbers++;
//            if (number % 2 == 0) {
//                even++;
//            }
//        }
//
//        double average = (double) sum / numbers;
//        int odd = numbers - even;
//        System.out.println("Thank you and see you later!");
//        System.out.println("The sum is " + sum);
//        System.out.println("How many numbers: " + numbers);
//        System.out.println("Average: " + average);
//        System.out.println("Even numbers: " + even);
//        System.out.println("Odd numbers: " + odd);
//    }
//}

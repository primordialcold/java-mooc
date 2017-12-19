import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // write testcode here
//        int[] values = {6, 5, 8, 7, 11};
//        System.out.println("smallest: " + smallest(values));
//        System.out.println("Index of the smallest: " + indexOfTheSmallest(values));

//        int[] values = {-1, 6, 9, 8, 12};
//        System.out.println(indexOfTheSmallestStartingFrom(values, 1));
//        System.out.println(indexOfTheSmallestStartingFrom(values, 2));
//        System.out.println(indexOfTheSmallestStartingFrom(values, 4));

//        int[] values = {3, 2, 5, 4, 8};
//
//        System.out.println( Arrays.toString(values) );
//
//        swap(values, 1, 0);
//        System.out.println( Arrays.toString(values) );
//
//        swap(values, 0, 3);
//        System.out.println( Arrays.toString(values) );

        int[] values = {8, 3, 7, 9, 1, 2, 4};
        sort(values);
    }

    public static int smallest(int[] array) {
        // write the code here
        int i = 0;
        int smallest = array[i];

        for (i = 0; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }
        return smallest;
    }

    public static int indexOfTheSmallest(int[] array) {
        // write the code here
        int indexOfSmallest = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == smallest(array)) {
                indexOfSmallest = i;
                break;
            }
        }
        return indexOfSmallest;
    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        // write the code here
        int indexOfSmallestStartingFrom = 0;
        int smallestF = array[index];
        for (int i = index; i < array.length; i++) {
            if (array[i] < smallestF) {
                smallestF = array[i];
            }
            for(int x = index; x < array.length; x++){
                if(array[x] == smallestF){
                    indexOfSmallestStartingFrom = x;
                    break;
                }
            }
        }
        return indexOfSmallestStartingFrom;
    }

    public static void swap(int[] array, int index1, int index2) {
        // code goes here
        int x1 = array[index1];
        int x2 = array[index2];

        array[index2] = x1;
        array[index1] = x2;
    }

    public static void sort(int[] array) {
        System.out.println(Arrays.toString(array));

        for(int i = 0; i < array.length; i++){
            int x = indexOfTheSmallestStartingFrom(array,i);
            swap(array,i,x);
            System.out.println(Arrays.toString(array));
        }
    }
}

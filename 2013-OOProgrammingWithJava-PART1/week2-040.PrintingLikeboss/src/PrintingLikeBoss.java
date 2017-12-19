public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        int i = 0;

        while(i < amount){
            System.out.print("*");
            i++;
        }
        System.out.println();
    }

    public static void printWhitespaces(int amount) {
        // 40.1
        int i = 0;

        while(i < amount){
            System.out.print(" ");
            i++;
        }
    }

    public static void printTriangle(int size) {
        // 40.2
        int z = 1;
        int w = size - 1;
        while(z <= size){
            printWhitespaces(w);
            printStars(z);
            z++;
            w--;
        }
    }

    public static void xmasTree(int height) {
        // 40.3
        int z = 0;
        int w = height - 1;
        while(z < height){
            printWhitespaces(w);
            printStars(2*z+1);
            z++;
            w--;
        }
        printWhitespaces(height-2);
        printStars(3);
        printWhitespaces(height-2);
        printStars(3);
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}

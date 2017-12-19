
public class Smileys {

    public static void main(String[] args) {
        // Test your method at least with the following
        printWithSmileys("Method");
        printWithSmileys("Beerbottle");
        printWithSmileys("Interface");
    }

    private static void printWithSmileys(String characterString) {
        int z = characterString.length() + 8;

        if (characterString.length() % 2 == 1){
            z = z + 1;
        }

        int cap = z/2 - 1;

        for (int i = 0; i < cap; i++) {
            System.out.print(":)");
        }
        System.out.println("");
        System.out.print(":) ");
        System.out.print(characterString);
        System.out.print(" ");

        if (characterString.length() % 2 == 1){
        System.out.print(" ");
        }

        System.out.print(":)\n");

        for (int i = 0; i < cap; i++) {
            System.out.print(":)");
        }
        System.out.println("");

    }
}

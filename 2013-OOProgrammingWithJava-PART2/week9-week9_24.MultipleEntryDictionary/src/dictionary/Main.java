package dictionary;

public class Main {
    public static void main(String[] args) {
        // Test your dictionary here
        MultipleEntryDictionary dict = new PersonalMultipleEntryDictionary();
        dict.add("kuusi", "six");
        dict.add("kuusi", "spruce");

        dict.add("pii", "silicon");
        dict.add("pii", "pi");
        dict.add("pii", "cos");

        System.out.println(dict.translate("pii"));
        dict.remove("kuusi");
        System.out.println(dict.translate("kuusi"));
    }
}

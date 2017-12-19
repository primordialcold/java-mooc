import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Start your program here
        // ATTENTION: In your program, you can create only one instance of class Scanner!
        menu();

        Scanner reader = new Scanner(System.in);
        PersonalInformation PI = new PersonalInformation();

        while (true) {
            String input;

            System.out.println("\ncommand: ");
            input = reader.nextLine();

            if (input.equalsIgnoreCase("1")) {
                addNumber(reader, PI);
            } else if (input.equalsIgnoreCase("2")) {
                System.out.println("whose number: ");
                String name = reader.nextLine();
                searchNumber(name, PI);
            } else if (input.equalsIgnoreCase("3")) {
                System.out.println("number: ");
                String number = reader.nextLine();
                searchPerson(number, PI);
            } else if (input.equalsIgnoreCase("4")) {
                System.out.println("whose address: ");
                String name = reader.nextLine();
                System.out.println("street: ");
                String street = reader.nextLine();
                System.out.println("city: ");
                String city = reader.nextLine();
                addAddress(name, street, city, PI);
            } else if (input.equalsIgnoreCase("5")) {
                System.out.println("whose information: ");
                String name = reader.nextLine();
                searchInfo(name, PI);
            } else if (input.equalsIgnoreCase("6")) {
                System.out.println("whose information: ");
                String name = reader.nextLine();
                deleteInfo(name, PI);
            } else {
                break;
            }
        }
    }

    private static void menu() {
        System.out.println("phone search");
        System.out.println("available operations");
        System.out.println(" 1 add a number");
        System.out.println(" 2 search for a number");
        System.out.println(" 3 search for a person by phone number");
        System.out.println(" 4 add an address");
        System.out.println(" 5 search for personal information");
        System.out.println(" 6 delete personal information");
        System.out.println(" 7 filtered listing");
        System.out.println(" x quit");
    }

    private static void addNumber(Scanner reader, PersonalInformation PI) {
        System.out.println("whose number: ");
        String name = reader.nextLine();
        System.out.println("number: ");
        String number = reader.nextLine();

        PI.addPerson(name);
        List<String> phones = new ArrayList<String>();

        for (Person p : PI.getPersonalInformation()) {
            if (p.getName().equalsIgnoreCase(name)) {
                if (p.getPhone() == null) {
                    phones.add(number);
//                    p.addNumber(phones);
                    return;
                } else {
                    p.getPhone().add(number);
//                    p.addNumber(phones);
                    return;
                }
            }
        }
    }

    private static void searchNumber(String name, PersonalInformation PI) {
        for (Person p : PI.getPersonalInformation()) {
            if (p.getName().equalsIgnoreCase(name)) {
                for (int i = 0; i < p.getPhone().size(); i++) {
                    System.out.println(" " + p.getPhone().get(i));
                }
                return;
            }
        }
        System.out.println("not found");
    }

    private static void searchPerson(String number, PersonalInformation PI) {
        for (Person p : PI.getPersonalInformation()) {
            if (p.getPhone().contains(number)) {
                System.out.println(p.getName());
            } else {
                System.out.println(" not found");
            }
        }
    }

    private static void addAddress(String name, String street, String city, PersonalInformation PI) {
        String address = city + " " + street;

        if (!PI.getPersonalInformation().contains(name)) {
            PI.addPerson(name);
        }

        for (Person p : PI.getPersonalInformation()) {
            if (p.getName().equalsIgnoreCase(name)) {
                p.addAddress(address);
            }
        }
    }

    private static void searchInfo(String name, PersonalInformation PI) {
        for (Person p : PI.getPersonalInformation()) {
            if (p.getName().equalsIgnoreCase(name)) {
                if (p.getAddress() == null) {
                    System.out.println("  address unknown");
                } else {
                    System.out.println("  address: " + p.getAddress());
                }
                if (p.getPhone().size() == 0) {
                    System.out.println("  phone number not found");
                } else {
                    System.out.println("  phone numbers:");
                    for (int i = 0; i < p.getPhone().size(); i++) {
                        System.out.println("   " + p.getPhone().get(i));
                    }
                    return;
                }
            }
        }
        System.out.println(" not found");
    }

    public static void deleteInfo(String name, PersonalInformation PI) {
//        System.out.println("whose information: ");
//        String name = reader.nextLine();

        for (Person p : PI.getPersonalInformation()) {
            if (p.getName().equalsIgnoreCase(name)) {
                PI.removePerson(p.getName());
                return;
            }
        }
    }
}


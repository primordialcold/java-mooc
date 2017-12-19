
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write here the main program
        Scanner reader = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<Student>();

        String name = "x";

        while (!name.equals("")) {
            System.out.println("name:");
            name = reader.nextLine();

            if (!name.equals("")) {
                System.out.println("studentnumber:");
                String studentnumber = reader.nextLine();
                list.add(new Student(name, studentnumber));
            }
        }

        for(Student stud : list){
            System.out.println(stud);
        }

        System.out.println("Give search term: ");
        String search = reader.nextLine();

        System.out.println("Result:");
        for(Student stud : list){
            if((stud.getName()).contains(search)){
                System.out.println(stud);
            }
        }
    }
}
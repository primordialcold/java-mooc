import java.util.ArrayList;

public class Phonebook {

//    private String name;
//    private String number;
    private ArrayList<Person> lista;

    public Phonebook() {
        this.lista = new ArrayList<Person>();
    }

    public void add(String name, String number){
//        this.name = name;
//        this.number = number;
        Person person = new Person(name, number);
        this.lista.add(person);
    }

    public void printAll(){
        for(Person ludzie : this.lista){
            System.out.println(ludzie);
        }
    }

    public String searchNumber(String name){
        for(Person person : this.lista) {
            if(person.getName().equals(name)){
                return person.getNumber();
            }
        }
        return "number not known";
    }
}

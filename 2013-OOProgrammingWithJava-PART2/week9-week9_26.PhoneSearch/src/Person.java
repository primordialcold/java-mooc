import java.util.ArrayList;
import java.util.List;

public class Person {

    private String name;
    private List<String> phone;
//    private List<String> address;
    private String address;

    public Person(String name){
        this.name = name;
        this.phone = new ArrayList<String>();
//        this.address = new ArrayList<String>();
    }

    public void addNumber(String number){
        this.phone.add(number);
    }

    public void addAddress(String address){
        this.address = address;
    }

    public String getName(){
        return this.name;
    }

    public List<String> getPhone(){
        return this.phone;
    }

    public String getAddress(){
        return this.address;
    }

}

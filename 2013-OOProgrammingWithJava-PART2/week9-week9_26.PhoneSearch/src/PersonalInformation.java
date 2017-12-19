import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PersonalInformation {

    private List<Person> personalInfo;
    private Person person;

    public PersonalInformation(){
        this.personalInfo = new ArrayList<Person>();
    }

    public void addPerson(String name){
        person = new Person(name);
        if(!this.personalInfo.contains(person)){
            this.personalInfo.add(person);
        }
    }

    public List<Person> getPersonalInformation(){
        return this.personalInfo;
    }

    public void removePerson(String name){
        List<Person> toRemove = new ArrayList<Person>();
        for(Person p : personalInfo){
            if(p.getName().equalsIgnoreCase(name)){
                toRemove.add((p));
            }
        }
        personalInfo.removeAll(toRemove);
    }
}

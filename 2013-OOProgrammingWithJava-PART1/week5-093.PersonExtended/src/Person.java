import java.util.Calendar;

public class Person {
    private String name;
    private MyDate birthday;
    private MyDate dzisiaj = new MyDate(Calendar.getInstance().get(Calendar.DATE), Calendar.getInstance().get(Calendar.MONTH) + 1, Calendar.getInstance().get(Calendar.YEAR));

    
    public Person(String name, int day, int month, int year) {
        this.name = name;
        this.birthday = new MyDate(day, month, year);
    }

    public Person(String name, MyDate birthday){
        this.name = name;
        this.birthday = birthday;
    }

    public Person(String name){
        this.name = name;
        this.birthday =  dzisiaj;
    }
    
    
    public int age() {
        // calculate the age based on the birthday and the current day
        // you get the current day as follows: 
        // Calendar.getInstance().get(Calendar.DATE);
        // Calendar.getInstance().get(Calendar.MONTH) + 1; // January is 0 so we add one
        // Calendar.getInstance().get(Calendar.YEAR);

        return dzisiaj.differenceInYears(birthday);
    }
    
    public boolean olderThan(Person compared) {
        // compare the ages based on birthdays

        if(this.birthday.earlier(compared.birthday)){
            return  true;
        }
        return false;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String toString() {
        return this.name + ", born " + this.birthday;
    }
}

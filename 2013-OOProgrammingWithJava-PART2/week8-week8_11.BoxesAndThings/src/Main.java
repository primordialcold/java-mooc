public class Main {

    public static void main(String[] args) {
        Box box = new Box(10);
        Box box2 = new Box(3);

        box.add( new Book("Fedor Dostojevski", "Crime and Punishment", 2) ) ;


        box2.add( new CD("Pink Floyd", "Dark Side of the Moon", 1973) );
        box2.add( new CD("Wigwam", "Nuclear Nightclub", 1975) );
        box2.add( new CD("Rendezvous Park", "Closer to Being Here", 2012) );

        box.add(box2);

        System.out.println( box );
    }

}
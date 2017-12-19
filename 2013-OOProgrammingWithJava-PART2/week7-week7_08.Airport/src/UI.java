import java.util.ArrayList;
import java.util.Scanner;

public class UI {

    private Scanner reader;
    private ArrayList<Plane> planes;
    private ArrayList<Flight> flights;

    public UI(Scanner reader) {
        this.reader = reader;
        this.planes = new ArrayList<Plane>();
        this.flights = new ArrayList<Flight>();
    }

    public void start() {
        airportPanel();
        flightService();
    }

    private void airportPanel() {

        while (true) {
            airportOperations();
            String input = reader.nextLine();

            if (input.equals("1")) {
                addPlane();
            } else if (input.equals("2")) {
                addFlight();
            } else {
                break;
            }
        }
    }

    private void airportOperations(){
        System.out.println("\nAirport panel");
        System.out.println("--------------------");
        System.out.println("Choose operation:");
        System.out.println("[1] Add airplane");
        System.out.println("[2] Add flight");
        System.out.println("[x] Exit\n");
        System.out.print("> ");
    }

    private void flightService() {

        while (true) {
            serviceOperations();
            String input = reader.nextLine();

            if (input.equals("1")) {
                for (Plane plane : planes) {
                    System.out.println(plane);
                }
            } else if (input.equals("2")) {
                for (Flight flight : flights) {
                    System.out.println(flight);
                }
            } else if (input.equals("3")) {
                System.out.println("Give plane ID: ");
                String plane = reader.nextLine();
                System.out.println(getPlane(plane));
            } else {
                break;
            }
        }
    }

    private void serviceOperations(){
        System.out.println("\nFlight service");
        System.out.println("------------");
        System.out.println("Choose operation:");
        System.out.println("[1] Print planes");
        System.out.println("[2] Print flights");
        System.out.println("[3] Print plane info");
        System.out.println("[x] Quit\n");
        System.out.print("> ");
    }

    private void addPlane(){
        System.out.println("Give plane ID: ");
        String ID = reader.nextLine();
        System.out.println("Give plane capacity: ");
        int capacity = Integer.parseInt(reader.nextLine());
        this.planes.add(new Plane(ID, capacity));
    }

    private void addFlight(){
        System.out.println("Give plane ID: ");
        String plane = reader.nextLine();
        System.out.println("Give departure airport code: ");
        String departure = reader.nextLine();
        System.out.println("Give destination airport code: ");
        String destination = reader.nextLine();
        this.flights.add(new Flight(getPlane(plane), departure, destination));
    }

    private Plane getPlane(String word){
        for(Plane plane : planes){
            if(plane.getPlaneID().equals(word)){
                return plane;
            }
        }
        return null;
    }
}


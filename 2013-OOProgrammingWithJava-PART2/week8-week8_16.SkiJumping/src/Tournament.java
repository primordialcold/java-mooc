import java.util.ArrayList;
import java.util.Scanner;

public class Tournament {
    private ArrayList<Jumper> jumpers;
    private Ladder ladder;
    private Scanner reader;
    private int round;

    public Tournament(Scanner reader) {
        this.reader = reader;
        this.jumpers = new ArrayList<Jumper>();
        this.round = 0;
        this.ladder = new Ladder();
    }

    public void start() {
        initiation();
        tournament();
    }

    private void initiation() {

        System.out.println("Kumpula ski jumping week\n");
        System.out.println("Write the names of the participants one at a time; an empty string brings you to the jumping phase.");

        while (true) {
            System.out.println("  Participant name: ");
            String input = reader.nextLine();

            if (input.equals("")) {
                break;
            } else {
                jumpers.add(new Jumper(input));
            }
        }
    }

    private void tournament(){

        for(Jumper participant : this.jumpers) {
            this.ladder.addJumper(participant);
        }

        System.out.println("The tournament begins!\n");

        while(true) {
            System.out.println("Write \"jump\" to jump; otherwise you quit: ");
            String input = reader.nextLine();

            if(input.equals("jump")){
                jump();
            } else if(input.equals("quit")){
                summary();
            }
        }
    }

    private void jump() {
        this.round++;
        int x = 1;

        System.out.println("Round " + this.round);
        System.out.println("\nJumping order:");

        for (Jumper jumper : this.jumpers) {
            System.out.println(x + ". " + jumper);
            x++;
        }

        this.ladder.scoreJumpers();

        System.out.println("Results of round " + this.round);

        this.ladder.getScores();
    }


    private void summary(){
        System.out.println("summary");
    }
}

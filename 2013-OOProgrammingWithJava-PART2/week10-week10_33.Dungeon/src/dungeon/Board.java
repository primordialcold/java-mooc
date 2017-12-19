package dungeon;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Board extends Dungeon {

//    private int height;
//    private int length;
//    private Dungeon dungeon;
    private Random random;
    private List<Players> players;
    private Human human;

    public Board(int length, int height, int vampires, int moves, boolean vampiresMove){
        super(length,height,vampires,moves,vampiresMove);
//        this.dungeon = dungeon;
//        this.height = dungeon.getHeight();
//        this.length = dungeon.getLength();
        this.players = new ArrayList<Players>();
        this.human = new Human();
        this.random = new Random();
    }

//    public int getLength(){ return this.length; }
//    public int getHeight(){ return this.height; }

    private void vampireStart(){

        for(int i = 1; i < super.getVampires()+1; i++) {
            this.players.add(new Vampire(i));
        }

        for (Players vamp : players) {
            vamp.setX(random.nextInt(super.getLength()));
            vamp.setY(random.nextInt(super.getHeight()));

            if (vamp.getX() == 0 || vamp.getY() == 0) {
                vamp.setX(1 + random.nextInt(super.getLength() - 1)) ;
                vamp.setY(1 + random.nextInt(super.getHeight() - 1));
            }
        }
    }

    public void printBoard(){
        for(int y = 0; y < super.getHeight(); y++) {
            for (int x = 0; x < super.getLength(); x++) {
                System.out.println(".");
            }
        }
    }





}

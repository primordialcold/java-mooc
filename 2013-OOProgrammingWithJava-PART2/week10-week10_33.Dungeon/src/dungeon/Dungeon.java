package dungeon;

public class Dungeon {

    private int length;
    private int height;
    private int vampires;
    private int moves;
    private boolean vampiresMove;
    private Board board;

    public Dungeon(int length, int height, int vampires, int moves, boolean vampiresMove){
        this.length = length;
        this.height = height;
        this.vampires = vampires;
        this.moves = moves;
        this.vampiresMove = vampiresMove;
        this.board = new Board(length,height,vampires,moves,vampiresMove);
    }

    public int getLength(){ return this.length; }
    public int getHeight(){ return this.height; }
    public int getVampires(){ return this.vampires; }

    public void run(){
        this.board.printBoard();
    }
}

package dungeon;

public class Vampire implements Players {

    private int x;
    private int y;
    private int name;
//    private Dungeon dungeon;
//    private int howMany;
//    private List<Vampire> vampires;
//    private Board board;

    public Vampire(int name) {
        this.name = name;
//        this.dungeon = dungeon;
//        this.howMany = dungeon.getVampires();
//        this.vampires = new ArrayList<Vampire>();
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }

    public String toString(){
        return "v " + getX() + " " + getY();
    }
}

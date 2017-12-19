package dungeon;

public class Human implements Players {
    private int x;
    private int y;

    public Human() {
        this.x = 0;
        this.y = 0;
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
        return "@ " + getX() + " " + getY();
    }
}

public class Player {
    private String name;
    private int goals;

    public Player (String name, int goalsAtStart){
        this.name = name;
        this.goals = goalsAtStart;
    }

    public Player (String name){
        this.name = name;
        this.goals = 0;
    }

    public String getName(){
        return this.name;
    }

    public int goals(){
        return this.goals;
    }

    public String toString(){
        return this.name + ", goals " + this.goals;
    }
}

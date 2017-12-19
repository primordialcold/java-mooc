import java.util.ArrayList;

public class Team {
    private String teamName;
    private int maxSize = 16;
    private ArrayList<Player> members = new ArrayList<Player>();

    public Team (String name){
        this.teamName = name;
        //this.members = new ArrayList<Player>();
    }

    public String getName(){
        return this.teamName;
    }

    public void addPlayer(Player gracz) {
        if (members.size() < this.maxSize) {
            members.add(gracz);
        }
    }

    public void printPlayers(){

        for(Player gracz : this.members){
            System.out.println(gracz);
        }
    }

    public void setMaxSize(int maxSize){
        this.maxSize = maxSize;
    }

    public int size(){
        return members.size();
    }

    public int goals(){
        int goals = 0;
        for(Player gracz : this.members){
            goals += gracz.goals();
        }
        return goals;
    }
}

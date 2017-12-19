package movable;

import java.util.ArrayList;
import java.util.List;

public class Group implements Movable {

    private List<Movable> organisms;

    public Group(){
        this.organisms = new ArrayList<Movable>();
    }

    public String toString(){
        String output ="";
        for(Movable m : organisms){
            output += m.toString();
            output += "\n";
        }
        return output;
    }

    public void addToGroup(Movable movable){
        this.organisms.add(movable);
    }

    public void move(int dx, int dy){
        for(Movable m : organisms){
            m.move(dx, dy);
        }
    }
}

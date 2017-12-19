import java.util.ArrayList;

public class Changer {

    private final ArrayList<Change> changes;

    public Changer() {
        changes = new ArrayList<Change>();
    }

    public void addChange(Change change) {
        changes.add(change);
    }

    public String change(String characterString) {
        for (Change Change : changes) {
            characterString = Change.change(characterString);
        }
        return characterString;
    }
}

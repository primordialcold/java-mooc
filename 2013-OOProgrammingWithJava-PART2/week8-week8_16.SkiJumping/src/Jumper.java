public class Jumper {

    private String name;
    private int points;
    private Ladder ladder;

    public Jumper(String name) {
        this.name = name;
        this.points = 0;
        this.ladder = new Ladder();
    }

    public String getName() {
        return this.name;
    }

    public int getPoints() {
        return this.points;
    }

    public void addPoints(int points){
        this.points += points;
    }

    public void addJumpLength(){

    }

    public void addJudgeScores(){

    }

    public int getJumpLength(){

    }

    public int getJudgeScores(){

    }

    @Override
    public String toString() {
        return this.name + " (" + this.points + " )";
    }
}

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Ladder {

    private List<Jumper> jumpers;
    private Random random = new Random();


    public Ladder() {
        this.jumpers = new ArrayList<Jumper>();
    }

    public void addJumper(Jumper jumper) {
        this.jumpers.add(jumper);
    }

    public void scoreJumpers() {
        for (Jumper jumper : this.jumpers) {
            int jumpLength = jumpLength();
            jumper.addJumpLength(jumpLength);
            jumper.addJudgeScores(judgeScores);
            int judgePoints = judgePoints();
            int score = jumpLength + judgePoints;
            jumper.addPoints(score);
        }
    }

    //split scoring from jumps and scoring from judges to two methods (scoring of judges might have to be split even further to a before and after state)
    //use for jumper loops to use jumper add methods so that last method getscores can use get methods from jumper class

    private int scoring() {
        return jumpLength() + judgePoints();;
    }

    private int jumpLength(){
        int jumpLength = random.nextInt(0 - 60) + 60;
        return jumpLength;
    }

    public List judgeScores() {

        List<Integer> judgeScores = new ArrayList<Integer>();

        for (int i = 0; i < 5; i++) {
            int sumFromJumps = random.nextInt(10 - 20);
            judgeScores.add(sumFromJumps);
        }
        return judgeScores;
    }

    private int judgePoints(){
        Collections.sort(judgeScores);
        judgeScores.remove(0);
        judgeScores.remove(judgeScores.size() - 1);

        int sumNormalized = 0;

        for (int score : judgeScores) {
            sumNormalized += score;
        }
        return sumNormalized;
    }

    public String getScores() {

        for (Jumper jumper : this.jumpers) {
            System.out.println("  " + jumper);
            System.out.println("   length: " + jumper.getJumpLength());
            System.out.println("    judge votes: " + jumper.getJudgeScores());
        }

    }
}

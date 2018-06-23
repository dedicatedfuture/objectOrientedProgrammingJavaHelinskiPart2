/**
 * Created by Bill on 6/20/18.
 */
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;
public class Jumper implements Comparable<Jumper>{
    private String name;
    private HashMap<String, Integer> jumpers;
    private int round;
    private ArrayList<Integer> judgeScores = new ArrayList<Integer>();
    private ArrayList<Integer> jumpLengths = new ArrayList<Integer>();
    private int score;

    public Jumper(String name){
        this.name = name;
        this.score = 0;
        this.round = 0;
    }



    public void jumpRound(){
        this.round++;
        //need to sort and decide order, least points first, return jumping order

        //need to randomize the length of a jump 60 -120, need to hold each jump length for each person until end
        this.jumpLengths.add(createJumpLength());
        //need to randomize 5 judge scores 10 - 20, show all, then throw out best and worst
        this.judgeScores = createJudgeScores();
        //add up total score
        this.score = addUpScore(this.score);
    }


    public ArrayList<Integer> createJudgeScores(){
        int randomNumber;
        ArrayList<Integer> createJudgeScores = new ArrayList<Integer>();
        Random random = new Random();
        for(int i = 0; i < 5; i++){
            randomNumber = random.nextInt( 10);
            randomNumber += 10;
            createJudgeScores.add(randomNumber);
        }
        return createJudgeScores;
    }


    public int getScore(){
        return this.score;
    }

    public int getRound(){
        return this.round;
    }

    public String getName(){
        return this.name;
    }
    public ArrayList<Integer> getJumpLengths(){
        return this.jumpLengths;
    }

    public ArrayList<Integer> getJudgeScores(){
        return this.judgeScores;
    }

    public int createJumpLength(){
        Random random = new Random();
        return random.nextInt(60) + 60;
    }


    public int addUpScore(int incomingScore){
        int total = incomingScore;
        Collections.sort(this.judgeScores);

        for(int i = 1; i < (this.judgeScores.size()-1); i++){
            total += this.judgeScores.get(i);
        }


        total += jumpLengths.get(round-1);

        return total;
    }

    @Override
    public int compareTo(Jumper jumper){
        return this.getScore() - jumper.getScore();
    }

}

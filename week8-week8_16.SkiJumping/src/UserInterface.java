/**
 * Created by Bill on 6/20/18.
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class UserInterface {
    private Scanner reader;
    private ArrayList<String> jumpers;
    private ArrayList<Jumper> competitors = new ArrayList<Jumper>();

    public UserInterface(){
        reader = new Scanner(System.in);
        jumpers = new ArrayList<String>();
    }


    public void start(){
        System.out.println("Kumpula ski jumping week");
        System.out.println();

        getNames();
        getRounds();
        finish();

    }

    public void getNames(){
        String reply = "";
        System.out.println("Write the names of the participants one at a time; an empty string brings you to the jumping phase.");
        while(true){
            System.out.print("  Participant name: ");
            reply = reader.nextLine();

            if(reply.equals("")){
                System.out.println();
                System.out.println("The tournament begins!");
                System.out.println();
                break;
            }
            jumpers.add(reply);
        }
        for(String jumper : jumpers){
            this.competitors.add(new Jumper(jumper));
        }
    }

    public void getRounds(){
        String reply = "";
        while(true){
            System.out.print("Write \"jump\" to jump; otherwise you quit:");
            reply = reader.nextLine();

            if(reply.equals("jump")){
                //this is where i will implement rounds
                printRound();
                for(Jumper jump : competitors){
                    jump.jumpRound();
                }
                printRoundResults();
            }else{
                break;
            }
        }
    }

    public void printRound(){

        int round = competitors.get(0).getRound();
        round+=1;
        System.out.println();
        System.out.println("Round " + round);
        System.out.println();
        System.out.println("Jumping order: ");
        sortJumpingOrder();
        for(int i = 0; i < competitors.size(); i++){
            System.out.println("  " + (i+1) + ". " + competitors.get(i).getName() + " (" + competitors.get(i).getScore() +
            " points)");
        }


    }

    public void printRoundResults(){
        int round = competitors.get(0).getRound();
        System.out.println();
        System.out.println("Results of round " + round);
        for(Jumper jumper : competitors){
            System.out.println("  "+jumper.getName());
            ArrayList<Integer> lengths = jumper.getJumpLengths();
            System.out.println("    length: " + lengths.get(round-1));
            System.out.println("    judge votes: " + jumper.getJudgeScores());
        }
    }

    public void sortJumpingOrder(){
         Collections.sort(competitors);
    }

    public void finish(){
        System.out.println();
        System.out.println("Thanks!");
        System.out.println();
        System.out.println("Tournament results:");
        System.out.println("Position    Name");
        Collections.sort(competitors);
        Collections.reverse(competitors);
        for(int i = 0; i < competitors.size(); i++){
            System.out.println((i+1) + "           " + competitors.get(i).getName() +
                    " (" +competitors.get(i).getScore() +
                    " points)");

            System.out.print("            jump lengths: "  );


            ArrayList<Integer> lengthHolder = competitors.get(i).getJumpLengths();
            for(int j = 0; j < lengthHolder.size(); j++){
                if(j == lengthHolder.size() - 1){
                    System.out.print(lengthHolder.get(j) + " m ");
                }else {
                    System.out.print(lengthHolder.get(j) + " m, ");
                }
            }
            System.out.println();

        }

    }

}

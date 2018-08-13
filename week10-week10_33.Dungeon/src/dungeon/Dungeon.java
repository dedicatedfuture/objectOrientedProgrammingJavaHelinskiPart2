package dungeon;

/**
 * Created by Bill on 7/24/18.
 */
import java.util.Random;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;


public class Dungeon {
    private int length, height, moves;
    private boolean vampiresMove;
    private List<Vampire> vampires;
    private Scanner reader;
    private Player player;


    public Dungeon(int length, int height, int vampires, int moves, boolean vampiresMove){
        this.length = length;
        this.height = height;

        this.moves = moves;
        this.vampiresMove = vampiresMove;

        this.vampires = new ArrayList<Vampire>();
        this.reader = new Scanner(System.in);

        this.player = new Player(this.length, this.height);

        for(int i = 0; i < vampires; i++){
            this.vampires.add(new Vampire(this.length, this.height));
        }

    }

    public void run(){
        //starts the game


        while(this.moves > 0) {
            scoreboard();
            setTheBoard();

            String input = reader.nextLine();
            for (int i = 0; i < input.length(); i++) {
                this.player.move(input.charAt(i));
                checkVampireDeath();
            }

            if (this.vampires.isEmpty()) {
                playerWin();
                break;
            }

            if(this.vampiresMove) {
                for (Vampire vamp : this.vampires) {
                    for (int i = 0; i < input.length(); i++) {
                        vamp.move();
                    }
                }
            }

            this.moves--;




        }
        if (this.moves == 0) {
            playerLose();
        }



    }

    public void playerLose(){
        System.out.println("YOU LOSE");

    }

    public void playerWin(){
        System.out.println("YOU WIN");

    }

    public void checkVampireDeath(){
        for(int i = 0; i < this.vampires.size(); i++){
            if(this.player.getX() == this.vampires.get(i).getX() && this.player.getY() == this.vampires.get(i).getY()){
                this.vampires.remove(i);
            }
        }
    }

    public void scoreboard(){
        System.out.println(this.moves);
        System.out.println();
        System.out.println(this.player);
        for(Vampire vamp : this.vampires){
            System.out.println(vamp);
        }
        System.out.println("");

    }

    public void setTheBoard(){
        Boolean printed;

        for(int y = 0; y < this.height; y++){
            for(int x = 0; x < this.length; x++){

                printed = false;

                if(this.player.getX() == x && this.player.getY() == y){
                    System.out.print("@");
                    printed = true;
                }

                for(Vampire vamp : this.vampires){
                    if(vamp.getX() == x && vamp.getY() == y){
                        System.out.print("v");
                        printed = true;

                    }
                }

                if(printed == false){
                    System.out.print(".");
                }

            }
            System.out.println("");
        }
    }


}

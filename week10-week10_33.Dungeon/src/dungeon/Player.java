package dungeon;

/**
 * Created by Bill on 8/12/18.
 */
public class Player {

    private int x, y, length, height;


    public Player(int length, int height){
        this.length = length;
        this.height = height;
        this.x = 0;
        this.y = 0;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void move(char instructions){

            //have to use the ASCII code for the char
            //119 = w, 115 = s, 97 = a, 100 = d
            if(instructions == 119 && (this.y- 1) >= 0 ){
                this.y--;
            }else if(instructions == 115 && (this.y +1 ) < this.height){
                this.y = this.y + 1;
            }else if(instructions == 97 && (this.x -1) >= 0){
                this.x--;
            }else if(instructions == 100 && (this.x +1) < this.length){
                this.x++;
            }

    }

    @Override
    public String toString() {
        return "@ " + this.getX() + " " + this.getY();
    }
}

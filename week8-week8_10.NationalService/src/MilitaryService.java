/**
 * Created by Bill on 5/25/18.
 */
public class MilitaryService implements NationalService {
    private int daysLeft;

    public MilitaryService(int daysLeft){
        this.daysLeft = daysLeft;
    }

    public int getDaysLeft(){
        return this.daysLeft;
    }
    public void work(){
        if (this.daysLeft > 0){
            this.daysLeft -= 1;
        }
    }
}

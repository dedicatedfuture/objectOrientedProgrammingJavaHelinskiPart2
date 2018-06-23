/**
 * Created by Bill on 5/25/18.
 */
public class CivilService implements NationalService {
    private int daysLeft;

    public CivilService(){
        this.daysLeft = 362;
    }

    public void work(){
        if (this.daysLeft > 0){
            this.daysLeft -= 1;
        }

    }

    public int getDaysLeft(){
        return this.daysLeft;
    }

}

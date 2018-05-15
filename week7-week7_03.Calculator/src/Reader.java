/**
 * Created by Bill on 2/23/18.
 */
import java.util.Scanner;
public class Reader {

    private Scanner reader;

    public Reader(){
        this.reader = new Scanner(System.in);
    }


    public String readString(){
        String newString = reader.nextLine();
        return newString;
    }

    public int readInteger(){
        int newInteger = Integer.parseInt(reader.nextLine());
        return newInteger;
    }
}

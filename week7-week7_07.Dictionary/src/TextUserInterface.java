/**
 * Created by Bill on 4/30/18.
 */
import java.util.Scanner;
public class TextUserInterface {
    private Scanner reader;
    private Dictionary dictionary;

    public TextUserInterface(Scanner reader, Dictionary dictionary){
        this.reader = reader;
        this.dictionary = dictionary;
    }

    public void start(){
        while(true) {
            System.out.print("Statement: ");
            String response = this.reader.nextLine();

            if (response.equals("quit")) {
                break;
            } else if (response.equals("add")) {
                this.add();
            } else if(response.equals("translate")){
                this.translate();
            } else{
                System.out.println("Unknown Statement");
            }
        }
    }

    public void add(){
        System.out.print("In Finnish: ");
        String key = reader.nextLine();
        System.out.print("Translation: ");
        String word = reader.nextLine();

        this.dictionary.add(key, word);
    }

    public void translate(){
        System.out.print("Give me a word: ");
        String key = reader.nextLine();
        System.out.println("Translation: " + this.dictionary.translate(key));
    }

}

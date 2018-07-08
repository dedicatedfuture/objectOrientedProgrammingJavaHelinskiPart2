/**
 * Created by Bill on 7/3/18.
 */

import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
public class Printer {
    private ArrayList<String> lines;
    private Scanner reader;
    public Printer(String fileName) throws Exception{

        File file = new File(fileName);
        this.lines = new ArrayList<String>();
        this.reader = new Scanner(file);

        while(this.reader.hasNextLine()){
            lines.add(reader.nextLine());
        }
    }

    public void printLinesWhichContain(String word){
        for(String line: lines){

            if(line.contains(word)){
                System.out.println(line);
            }

        }
    }
}

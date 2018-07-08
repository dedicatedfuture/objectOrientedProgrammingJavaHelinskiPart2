package file;
import java.io.File;

import java.util.Scanner;
import java.util.ArrayList;

/**
 * Created by Bill on 7/3/18.
 */
public class Analysis {
    private int numberOfLines = 0;
    private ArrayList<String> lines;
    private Scanner reader;

    public Analysis(File file) throws Exception{
        this.reader = new Scanner(file);
        this.lines = new ArrayList<String>();

        while(reader.hasNextLine()){
            this.lines.add(reader.nextLine() + "\n");
            this.numberOfLines++;
        }
    }

    public int lines(){
        return this.numberOfLines;
    }

    public int characters() throws Exception{
        int total = 0;
        for(String line : lines){
            total += line.length();
        }
        return total;
    }
}


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileManager {

    public ArrayList<String> read(String file) throws FileNotFoundException {
        ArrayList<String> lines = new ArrayList<String>();
        Scanner reader = new Scanner(file);

        while(reader.hasNextLine()){
            lines.add(reader.nextLine());
        }

        return lines;
    }

    public void save(String file, String text) throws IOException {
        FileWriter writer = new FileWriter(file);
        writer.write(text);

    }

    public void save(String file, List<String> texts) throws IOException {
        FileWriter writer = new FileWriter(file);

        for(String text : texts){
            writer.append("\n" + text);
        }


    }

}

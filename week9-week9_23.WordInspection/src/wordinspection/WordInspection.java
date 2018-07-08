package wordinspection;

/**
 * Created by Bill on 7/4/18.
 */
import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.lang.StringBuilder;


public class WordInspection {
    private ArrayList<String> lines;



    public WordInspection(File file) throws Exception{
        this.lines = new ArrayList<String>();

        Scanner reader = new Scanner(file,  "UTF-8");
        while (reader.hasNextLine()) {
            this.lines.add(reader.nextLine());

        }
    }

    public int wordCount(){
        int totalWordCount = 0;

        for(String line : this.lines){

            totalWordCount ++;
        }
        return totalWordCount;
    }


    public List<String> wordsContainingZ(){
        List<String> zWords = new ArrayList<String>();

        for(String line : this.lines){
            if(line.contains("Z") || line.contains("z")){
                zWords.add(line);
            }
        }
        return zWords;
    }


    public List<String> wordsEndingInL(){
        List<String> endingLWords = new ArrayList<String>();

        for(String line : this.lines){
            if(line.endsWith("l")){
                endingLWords.add(line);
            }
        }
        return endingLWords;
    }

    public List<String> palindromes(){
        List<String> palindromes = new ArrayList<String>();

        for(String line : this.lines){

            String reversed = "";
            for (int i = line.length() - 1; i >= 0; i--) {
                reversed += line.charAt(i);
            }


            if(line.equals(reversed)){
                palindromes.add(line);
            }
        }
        return palindromes;
    }

    public List<String> wordsWhichContainAllVowels(){
        List<String> allVowelWords = new ArrayList<String>();

        for(String line : this.lines){
            line.toLowerCase();
            if(line.contains("a") && line.contains("e") && line.contains("i")  && line.contains("o") && line.contains("u")
                    && line.contains("y") && line.contains("ä")  && line.contains("ö") ){
                allVowelWords.add(line);
            }
        }
        return allVowelWords;
    }

}

/**
 * Created by Bill on 1/22/18.
 */
public class Change {
    private char fromCharacter;
    private char toCharacter;

    public Change(char fromCharacter, char toCharacter){
        this.fromCharacter = fromCharacter;
        this.toCharacter = toCharacter;
    }

    public String change(String characterChange){
        String newWord = "";
       for(int i = 0; i < characterChange.length(); i++){
           char character = characterChange.charAt(i);
           if(character == this.fromCharacter){
               newWord += this.toCharacter;
           } else{
               newWord += character;
           }
       }

       return newWord;
    }
}

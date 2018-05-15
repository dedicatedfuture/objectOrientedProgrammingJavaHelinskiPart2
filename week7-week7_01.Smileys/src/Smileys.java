
public class Smileys {

    public static void main(String[] args) {
        // Test your method at least with the following
        // printWithSmileys("Method");
        // printWithSmileys("Beerbottle");
        // printWithSmileys("Interface");

        printWithSmileys("Arto");
    }

    private static void printWithSmileys(String characterString){

        if(characterString.length() % 2 == 0) {
            for(int i = 0; i < ((characterString.length()+6) /2); i++){
                System.out.print(":)");
            }
            System.out.println();

            System.out.println(":) " + characterString + " :)");
            for(int i = 0; i < ((characterString.length()+6) /2); i++){
                System.out.print(":)");
            }
        }else{
            for(int i = 0; i < ((characterString.length()+7) /2); i++){
                System.out.print(":)");
            }
            System.out.println();
            System.out.println(":) " + characterString + "  :)");
            for(int i = 0; i < ((characterString.length()+7) /2); i++){
                System.out.print(":)");
            }
        }
    }

}

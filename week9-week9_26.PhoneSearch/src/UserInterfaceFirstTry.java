/**
 * Created by Bill on 7/7/18.
 */
import java.util.*;

public class UserInterfaceFirstTry {
    private Scanner reader;
    private HashMap<String, PersonalInformation> phoneBook;

    public UserInterfaceFirstTry(){
        this.reader = new Scanner(System.in);
        this.phoneBook = new HashMap<String, PersonalInformation>();
    }

    public void start(){
        System.out.println("phone search");
        System.out.println("available operations:");
        System.out.println(" 1 add a number\n" +
                " 2 search for a number\n" +
                " 3 search for a person by phone number\n" +
                " 4 add an address\n" +
                " 5 search for personal information\n" +
                " 6 delete personal information\n" +
                " 7 filtered listing\n" +
                " x quit\n");

        while(true){
            System.out.print("command: ");
            String response = reader.nextLine();


            if(response.equals("x")){
                break;
            }else if(response.equals("1")){
                addNumber();
            }else if(response.equals("2")){
                searchNumber();
            }else if(response.equals("3")){
                searchPerson();
            }else if(response.equals("4")){
                addAddress();
            }else if(response.equals("5")){
                searchInformation();
            }else if(response.equals("6")){
                deleteInformation();
            }else if(response.equals("7")){
                filteredListing();
            }

        }
    }


    public void addNumber(){
        System.out.print("whose number: ");
        String name = reader.nextLine();
        System.out.print("number: ");
        String phoneNumber = reader.nextLine();

        if(this.phoneBook.containsKey(name)){
            this.phoneBook.get(name).addPhoneNumber(phoneNumber);
        }else{
            this.phoneBook.put(name, new PersonalInformation());
            this.phoneBook.get(name).addPhoneNumber(phoneNumber);
        }
    }

    public void addAddress(){
        System.out.print("whose address: ");
        String name = reader.nextLine();
        System.out.print("street: ");
        String street = reader.nextLine();
        System.out.print("city: ");
        String city = reader.nextLine();

        if(this.phoneBook.containsKey(name)){
            this.phoneBook.get(name).addAddress(street, city);
        }else{
            this.phoneBook.put(name, new PersonalInformation());
            this.phoneBook.get(name).addAddress(street, city);
        }
    }

    public void searchNumber(){
        System.out.print("whose number: ");
        String name = reader.nextLine();

        if(this.phoneBook.containsKey(name)){
           printPhoneNumbers(this.phoneBook.get(name).getPhoneNumbers());
        }else{
            System.out.println("not found");
        }
    }

    public void printPhoneNumbers(ArrayList<String> phoneNumbers){
        if(phoneNumbers.isEmpty()){
            System.out.println("not found");
        }else{
            for(String phoneNumber: phoneNumbers){
                System.out.println(phoneNumber);
            }
        }
    }

    public void searchPerson(){
        System.out.print("number: ");
        String phoneNumber = reader.nextLine();

        for(String key : this.phoneBook.keySet()){
            if(this.phoneBook.get(key).hasPhoneNumber(phoneNumber)){
                System.out.println(key);
            }
        }

    }

    public void searchInformation(){
        System.out.print("whose information: ");
        String name = reader.nextLine();

        this.phoneBook.get(name).getAddress();
        System.out.println("  phone numbers:");
        printPhoneNumbers(this.phoneBook.get(name).getPhoneNumbers());
    }

    public void deleteInformation(){
        System.out.print("whose information: ");
        String name = reader.nextLine();

        if(this.phoneBook.containsKey(name)){
            this.phoneBook.remove(name);
        }else{
            System.out.println("  not found");
        }
    }

    public void filteredListing(){
        System.out.println("keyword (if empty, all listed): ");
        String keyword = reader.nextLine();
        ArrayList<String> foundStreets = new ArrayList<String>();
        ArrayList<String> foundCities = new ArrayList<String>();

        if(keyword.equals("")){
            printPhonebook(this.phoneBook);
        }

        for(String name : this.phoneBook.keySet()){
           foundStreets = this.phoneBook.get(name).containsWord(keyword, this.phoneBook.get(name).getStreets());
           foundCities =  this.phoneBook.get(name).containsWord(keyword, this.phoneBook.get(name).getCities());
        }
    }

    public void printPhonebook(HashMap<String, PersonalInformation> phoneBooktoPrint){


        for(String entry : phoneBooktoPrint.keySet()){
            System.out.println("");
            System.out.println(" " + phoneBooktoPrint.get(entry));
            phoneBooktoPrint.get(entry).getAddress();
            printPhoneNumbers(phoneBooktoPrint.get(entry).getPhoneNumbers());
        }
    }
}

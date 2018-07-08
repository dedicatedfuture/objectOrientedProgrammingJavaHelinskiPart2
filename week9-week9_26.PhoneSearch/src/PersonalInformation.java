import java.util.ArrayList;

/**
 * Created by Bill on 7/7/18.
 */

public class PersonalInformation {
    private ArrayList<String> phoneNumbers;
    private ArrayList<String> streets;
    private ArrayList<String> cities;

    public PersonalInformation(){
        this.phoneNumbers = new ArrayList<String>();
        this.streets = new ArrayList<String>();
        this.cities = new ArrayList<String>();
    }

    public void addPhoneNumber(String phoneNumber){
        this.phoneNumbers.add(phoneNumber);
    }

    public void addAddress(String street, String city){
        this.streets.add(street);
        this.cities.add(city);
    }

    public ArrayList<String> getPhoneNumbers(){
        return this.phoneNumbers;
    }

    public boolean hasPhoneNumber(String phoneNumber){
        if(this.phoneNumbers.contains(phoneNumber)){
            return true;
        }
        return false;
    }

    public void getAddress(){

        if(this.streets.isEmpty()){
            System.out.println("  address unknown");
        }else{
            for(int i = 0; i < this.streets.size() - 1; i++){
                System.out.println("  address: " + this.streets.get(i) + " " + this.cities.get(i));
            }
        }

    }

    public ArrayList<String> getStreets(){
        return this.streets;
    }

    public ArrayList<String> getCities(){
        return this.cities;
    }

    public ArrayList<String> containsWord(String word, ArrayList<String> address){
        ArrayList<String> temp = new ArrayList<String>();


        for(String place: address){
            if(place.contains(word)){
                 temp.add(place);
            }
        }

      return temp;

    }

}

public class CD implements ToBeStored{
    private String artist, title;
    private int publishingYear;
    private double weight;

    public CD(String artist, String title, int publishingYear){
        this.artist = artist;
        this.title = title;
        this.publishingYear = publishingYear;
        this.weight = .1;
    }

    public double weight(){
        return this.weight;
    }

    public String toString(){
        return this.artist + ": " + this.title + " (" + this.publishingYear + ")" ;
    }
}
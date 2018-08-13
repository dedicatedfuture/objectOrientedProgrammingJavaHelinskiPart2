package farmsimulator;

/**
 * Created by Bill on 7/21/18.
 */

import java.util.Random;
public class Cow implements Milkable, Alive{
    private String name;
    private static final String[] NAMES = new String[]{
            "Anu", "Arpa", "Essi", "Heluna", "Hely",
            "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",
            "Jaana", "Jami", "Jatta", "Laku", "Liekki",
            "Mainikki", "Mella", "Mimmi", "Naatti",
            "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
            "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};
    private double udderCapacity;
    private double amount;

    @Override
    public void liveHour() {
        double moreMilk = .7 + (2 - .7) * new Random().nextDouble();

        if(this.amount + moreMilk <= this.udderCapacity){
            this.amount += moreMilk;
        }else{
            this.amount = this.udderCapacity;
        }

    }

    @Override
    public double milk() {
        double milk = this.amount;
        this.amount = 0;
        return milk;
    }

    public Cow(){
        this(NAMES[ new Random().nextInt(NAMES.length-1) ]);
    }

    public Cow(String name){
        this.name = name;
        Math.ceil(this.udderCapacity = 15 + (40 - 15) * new Random().nextDouble());
        this.amount = 0;
    }

    public String getName(){
        return this.name;
    }

    public double getCapacity(){
        return this.udderCapacity;
    }

    public double getAmount(){
        return this.amount;
    }

    public String toString(){
        return this.name + " " +  Math.ceil(this.amount) + "/" + Math.ceil(this.udderCapacity);
    }


}

package people;

/**
 * Created by Bill on 7/16/18.
 */
public class Teacher extends Person {
    private int salary;

    public Teacher(String name, String address, int salary) {
        super(name, address);
        this.salary = salary;
    }


    @Override
    public String toString() {
        return super.toString() + "\n" + "  salary " + this.salary + " euros/month";
    }
}

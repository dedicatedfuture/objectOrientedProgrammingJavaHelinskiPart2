package boxes;

public class Thing {

    private String name;
    private int weight;

    public Thing(String name, int weight) {

        this.name = name;
        if(weight < 0) {

            throw new IllegalArgumentException("please enter a valid weight");
        }
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == null) return false;
        if (!(o instanceof Thing)) return false;

        Thing thing = (Thing) o;

        if (getClass() != thing.getClass()) return false;
        return name.equals(thing.name);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result;
        return result;
    }

    public Thing(String name) {
        this(name, 0);
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }



}

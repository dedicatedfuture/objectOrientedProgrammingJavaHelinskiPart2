package containers;

/**
 * Created by Bill on 7/17/18.
 */
public class ProductContainerRecorder extends ProductContainer {

    private ContainerHistory history;

    public ProductContainerRecorder(String productName, double tilavuus, double initialValue) {
        super(productName, tilavuus);
        super.addToTheContainer(initialValue);
        this.history = new ContainerHistory();
        this.history.add(initialValue);

    }

    public String history(){
        return history.toString();
    }

    @Override
    public void addToTheContainer(double amount) {
        super.addToTheContainer(amount);
        this.history.add(super.getVolume());
    }

    @Override
    public double takeFromTheContainer(double amount) {
        double prevVolume = this.getVolume();
        super.takeFromTheContainer(amount);
        this.history.add(this.getVolume());
        return prevVolume - this.getVolume();
    }

    public void printAnalysis(){
        System.out.println("Product: " + super.getName());
        System.out.println("History: " + this.history());
        System.out.println("Greatest product amount: " + this.history.maxValue());
        System.out.println("Smallest product amount: " + this.history.minValue());
        System.out.println("Average: " + this.history.average());
        System.out.println("Greatest change: " + this.history.greatestFluctuation());
        System.out.println("Variance: " + this.history.variance());

    }
}

package containers;

/**
 * Created by Bill on 7/17/18.
 */
public class ProductContainer extends Container{
    private String productName;


    public ProductContainer( String productName, double tilavuus) {
        super(tilavuus);
        this.productName = productName;

    }

    public String getName() {
        return productName;
    }

    public void setName(String newName){
        this.productName = newName;
    }

    @Override
    public String toString() {
        return productName + ": " + super.toString();
    }
}

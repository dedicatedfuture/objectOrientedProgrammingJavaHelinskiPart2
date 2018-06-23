/**
 * Created by Bill on 6/4/18.
 */
public class Purchase {
    private String product;
    private int amount, unitPrice;


    public Purchase(String product, int amount, int unitPrice){
        this.product = product;
        this.amount = amount;
        this.unitPrice = unitPrice;
    }

    public String getProduct() {
        return product;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public int price(){
        return this.unitPrice * this.amount;
    }

    public void increaseAmount(){
        this.amount ++;
    }

    public String toString(){
        return this.product + ": " + this.amount;
    }



}

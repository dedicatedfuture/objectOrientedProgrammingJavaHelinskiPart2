/**
 * Created by Bill on 6/4/18.
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class Storehouse {
    private Map<String, Integer> products = new HashMap<String, Integer>();
    private Map<String, Integer> productStock = new HashMap<String, Integer>();

    public void addProduct(String product, int price, int stock){
        products.put(product, price);
        productStock.put(product, stock);
    }

    public int price(String product){
        if (!(this.products.containsKey(product))){
            return -99;
        }
        return products.get(product);
    }


    public int stock(String product){
        if (!(this.productStock.containsKey(product))){
            return 0;
        }
        return productStock.get(product);
    }

    public boolean take(String product){
        if (productStock.containsKey(product) && productStock.get(product) > 0){
            this.productStock.put(product, this.productStock.get(product) - 1);
            return true;
        }
        return false;
    }

    public Set<String> products(){
        return this.products.keySet();
    }

}

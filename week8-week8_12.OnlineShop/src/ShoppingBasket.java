/**
 * Created by Bill on 6/4/18.
 */

import java.util.Map;
import java.util.HashMap;
public class ShoppingBasket {

    private Map<String, Purchase> purchaseMap;

    public ShoppingBasket(){

        this.purchaseMap = new HashMap<String, Purchase>();
    }

    public void add(String product, int price){



            if(this.purchaseMap.containsKey(product)){
                purchaseMap.get(product).increaseAmount();
            }else{
                Purchase newBuy = new Purchase(product, 1, price);
                purchaseMap.put(product, newBuy);
            }


    }

    public int price(){
        int total = 0;
        for (Purchase purchase : this.purchaseMap.values()){
            total += purchase.price();
        }
        return total;
    }

    public void print(){


        for(Purchase purchase : this.purchaseMap.values()){
            System.out.println(purchase);
        }
    }
}

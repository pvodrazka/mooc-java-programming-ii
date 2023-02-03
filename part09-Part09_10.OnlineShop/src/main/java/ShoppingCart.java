import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {

    private Map<String, Item> mapa;


    public ShoppingCart() {
        this.mapa=new HashMap<>();

    }

    //public void add(String product, int price) adds an item to the cart
    // that matches the product given as a parameter, with the price given as a parameter.

    public void add(String product, int price) {
        if (this.mapa.containsKey(product)) {
            this.mapa.get(product).increaseQuantity();
        }

       else {
            Item predmet = new Item(product, 1, price);
            this.mapa.put(product, predmet);

        }
    }

   // public int price() returns the total price of the shopping cart.
   public int price() {
        int completePrice = 0;
       Collection<Item> values = this.mapa.values();

       for (Item value: values) {
           completePrice+=value.price();
       }

       return completePrice;
   }


    public void print() {
        Collection<String> keys = this.mapa.keySet();
        for (String klic: keys
             ) {
            System.out.println(klic + ": " + this.mapa.get(klic).getQty());

        }
    }
}


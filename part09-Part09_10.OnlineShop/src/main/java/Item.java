//Create the class Item with the following methods:
//
//public Item(String product, int qty, int unitPrice); a constructor that creates an item corresponding to
// the product given as a parameter. qty tells us how many of the product are in the item,
// while unitPrice is the price of a single product.
//public int price() return the price of the item. You get the items price by multiplying its unit price by its quantity(qty).
//public void increaseQuantity increases the quantity by one.
//public String toString() returns the string representation of the item. which must match the format shown in the example below.

import java.util.HashMap;
import java.util.Map;

public class Item {
    private String product;
    private int qty;
    private int unitPrice;
   // private Map<String, Integer> qtyMap;
  //  private Map<String, Integer> priceMap;

    public Item(String product, int qty, int unitPrice) {
       // this.qtyMap=new HashMap<>();
       // this.priceMap=new HashMap<>();
       // this.qtyMap.put(product, qty);
       // this.priceMap.put(product, unitPrice);
        this.product=product;
        this.qty=qty;
        this.unitPrice=unitPrice;

    }

    public int price() {
       // return this.qtyMap.get();
        return this.qty * this.unitPrice;
    }

    public void increaseQuantity() {
        this.qty++;
    }

    public String toString() {
        return this.product + ": "+ this.qty;
    }

    public int getQty() {
        return qty;
    }
}

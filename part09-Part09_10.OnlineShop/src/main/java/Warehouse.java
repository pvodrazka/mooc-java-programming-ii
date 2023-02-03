/*
Create the class Warehouse with the following methods:
public void addProduct(String product, int price, int stock), which adds a product to the warehouse with the price and
stock balance given as parameters.

public int price(String product), which returns the price of the product it received as a parameter.
If the product hasn't been added to the warehouse, the method must return -99.

The products in the warehouse (and in the next part their stock) must be stored in a variable of the
        type Map<String, Integer>! The object created can be a HashMap, but its type must be the Map-interface,
        rather than any implementation of that interface.

 */

import java.util.*;

public class Warehouse implements Obchod {
    private Map<String, Integer> priceMap;
    private Map<String, Integer> stockMap;



    public Warehouse() {
        this.priceMap = new HashMap<>();
        this.stockMap = new HashMap<>();

    }

    public void addProduct(String product, int price, int stock) {
        this.priceMap.put(product, price);
        this.stockMap.put(product, stock);
    }

    public int price(String product) {
        if (!priceMap.containsKey(product)) {
            return -99;
        } else return this.priceMap.get(product);
    }

    //Save the stock balance of products in a variable with the Map<String, Integer> type, in the same way the prices were stored.
    // Supplement the warehouse with the following methods:
    //
    //public int stock(String product) returns the current remaining stock of the product in the warehouse.
    // If the product hasn't been added to the warehouse, the method must return 0.
    //public boolean take(String product) reduces the stock remaining for the product it received as a parameter by one,
    // and returns true if there was stock remaining. If the product was not available in the warehouse
    // the method returns false. A products stock can't go below zero.

    public int stock(String product) {
        return this.stockMap.getOrDefault(product, 0);
    }

    public boolean take(String product) {
        if (!this.stockMap.containsKey(product)) {
            return false;
        }
        int stock = this.stockMap.get(product);

        if (stock >= 1) {
            stock--;
            this.stockMap.put(product, stock);
            return true;
        }


        else return false;


    }

    //Let's add one more method to the warehouse:
    //
    //public Set<String> products() returns the names of the products in the warehouse as a Set
    //This method is easy to implement with HashMap. You can get the products in the warehouse
    // from either the Map storing the prices or the one storing current stock, by using the method keySet()
    public Set<String> products() {
        return this.stockMap.keySet();    }
}

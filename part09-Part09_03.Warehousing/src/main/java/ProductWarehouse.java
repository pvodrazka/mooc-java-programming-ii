public class ProductWarehouse extends Warehouse {
    private String productName;

    public ProductWarehouse(String productName, double capacity) {
        super (capacity);
        this.productName = productName;
    }

    public String getName() {
        return this.productName;
    }

    public void setName(String newName) {
        this.productName = newName;
    }


    @Override
    public String toString() //- Returns the state of the object represented as
    // a string like this Juice: balance = 64.5, space left 123.5
    {
        return this.productName +": " + "balance = " + getBalance() + ", space left " + howMuchSpaceLeft();
    }

}

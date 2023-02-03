/*public class ProductWarehouseWithHistory extends ProductWarehouse {
    private ChangeHistory history;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) { //creates a product warehouse.
        // The product name, capacity, and initial balance are provided as parameters.
        // Set the initial balance as the initial balance of the warehouse, as well as the first value of the change history.
        super(productName, capacity);

        this.history = new ChangeHistory();
        // this.history.add(initialBalance);
        addToWarehouse(initialBalance);

    }

    public String history() //returns the product history like this [0.0, 119.2, 21.2].
    // Use the string representation of the ChangeHistory object as is.
    {
        return this.history.toString();
    }

    @Override

    public void addToWarehouse(double amount)//
    // works just like the method in the Warehouse class, but we also record the changed state to the history.
    // NB: the value recorded in the history should be the warehouse's balance after adding, not the amount added!
    {
        if (amount < 0) {
            return 0.0;
        }
        if (amount <= howMuchSpaceLeft()) {
            this.balance += amount;

        } else {
            this.balance = this.capacity;


        }
        this.history.add(getBalance());
    }

    public double takeFromWarehouse(double amount) // works just like the method in the Warehouse class,
    // but we also record the changed state to the history.
    // NB: the value recorded in the history should be the warehouse's balance after removing, not the amount removed!

    {
        if (amount < 0) {
            return 0.0;
        }
        if (amount > this.balance) {
            double allThatWeCan = this.balance;
            this.balance = 0.0;

            return allThatWeCan;
        }

        this.balance = this.balance - amount;
        ;
        this.history.add(this.balance);
        return amount;
    }

    public void printAnalysis()//, which prints history related information for the product in the way presented in the example.
    //Product: Juice
    // History: [1000.0, 988.7, 989.7]
    //Largest amount of product: 1000.0
    //Smallest amount of product: 988.7
    //Average: 992.8
    {
        System.out.println("Product: " + getName());
        System.out.println("History: " + this.history.toString());
        System.out.println("Largest amount of product: " + this.history.maxValue());
        System.out.println("Smallest amount of product: " + this.history.minValue());
        System.out.println("Average: " + this.history.average());


    }
}
*/

public class ProductWarehouseWithHistory extends ProductWarehouse {

    private ChangeHistory history;

    public ProductWarehouseWithHistory(String name, double capacity, double initalBalance) {
        super(name, capacity);
        history = new ChangeHistory();
        addToWarehouse(initalBalance);
    }

    public String history() {
        return history.toString();
    }

    public void printAnalysis() {
        System.out.println("Product: " + getName());
        System.out.println("History: " + history());
        System.out.println("Largest amount of product: " + history.maxValue());
        System.out.println("Smallest amount of product: " + history.minValue());
        System.out.println("Average: " + history.average());
    }

    @Override
    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        history.add(getBalance());
    }

    @Override
    public double takeFromWarehouse(double amount) {
        double received = super.takeFromWarehouse(amount);
        history.add(getBalance());
        return received;
    }
}
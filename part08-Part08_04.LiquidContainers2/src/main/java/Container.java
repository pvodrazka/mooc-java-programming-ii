public class Container {
    private int stock = 0;

    public Container() {
        this.stock = stock;
    }


    public int contains() {
        return this.stock;
    }

    public void add(int amount) {
        while (true) {
            if (amount < 0) {
                break;
            }
            this.stock += amount;
            if (this.stock > 100) {
                this.stock = 100;

            }
            break;
        }
    }

    public void remove(int amount) {
        while (true) {
            if (amount < 0) {
                break;
            }

            this.stock -= amount;
            if (this.stock < 0) {
                this.stock = 0;


            }
            break;
        }
    }

    public String toString() {
        return this.stock + "/100";
    }

    public void setStock(int amount) {
        this.stock=amount;
    }
}


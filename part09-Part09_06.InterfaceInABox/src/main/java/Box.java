//Make a class called Box. Items implementing the Packable interface can be packed into a box.
// The Box constructor takes the maximum capacity of the box in kilograms as a parameter.
// The combined weight of all items in a box cannot be more than the maximum capacity of the box.


import java.util.ArrayList;

public class Box implements Packable {
    private double maximumCapacity;
    //private double currentWeight;
    private ArrayList<Packable> list;

    public Box(double maximumCapacity) {
        this.maximumCapacity=maximumCapacity;
        this.list = new ArrayList<>();
    }

    public double weight() {
        double weight = 0;
        // calculate the total weight of the items in the box
        for (int i=0; i<list.size(); i++) {
            weight =weight + list.get(i).weight();
        }
        return weight;
    }

    public void add(Packable packable) {
        if (weight() + packable.weight() <= this.maximumCapacity) {
            list.add(packable);
           // this.currentWeight+=packable.weight();
        }
    }
        public int getSize() {
            return this.list.size();
        }

        public String toString() {
        return "Box: " + getSize() + " items, total weight " + weight() + " kg";

        }
    }


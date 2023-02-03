import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {
    private final int capacity;
    private int currentVaha=0;
    private ArrayList<Item> list;

    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        this.list = new ArrayList<>();
    }

@Override
    public void add(Item item) {
       /* if (!(this.currentVaha + item.getWeight() > this.capacity)) {
            this.currentVaha += item.getWeight();
            list.add(item);*/
    if (currentVaha + item.getWeight() <= this.capacity) {
        list.add(item);
        currentVaha += item.getWeight();
    }
        }





@Override
public boolean isInBox(Item item) {
    boolean stored = false;
    for (Item element : this.list) {
        if (element.getName().equals(item.getName())) {
            stored = true;
        }
    }
    return stored;
}
}

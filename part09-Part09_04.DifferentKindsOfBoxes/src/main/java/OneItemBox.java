import java.util.ArrayList;

public class OneItemBox extends Box {
    private int capacityJedna;
    private ArrayList<Item> list;

    public OneItemBox() {
        this.list = new ArrayList<>();
    }
@Override
    public void add(Item item) {
        if (list.isEmpty()) {
            list.add(item);
            capacityJedna = item.getWeight();
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

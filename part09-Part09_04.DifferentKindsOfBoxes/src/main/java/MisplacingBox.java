import java.util.ArrayList;

public class MisplacingBox extends Box{

    private final int capacity;
    private int currentVaha=0;
    private ArrayList<Item> list;

    public MisplacingBox() {
      this.capacity=0;
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
        return false;
    };

}

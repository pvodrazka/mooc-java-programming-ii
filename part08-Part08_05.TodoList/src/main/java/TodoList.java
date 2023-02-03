import java.util.ArrayList;

public class TodoList {
    private ArrayList seznam;

    public TodoList() {
        this.seznam = new ArrayList();
    }

    public void add(String task) {
        this.seznam.add(task);
    }

    public void print() {
        for (int i = 0; i < this.seznam.size(); i++) {
            System.out.println(i + 1 + ": " + this.seznam.get(i));
        }
    }

    public void remove(int number) {
        this.seznam.remove(number - 1);

    }
}

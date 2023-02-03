import java.util.ArrayList;

public class ChangeHistory {
    private ArrayList<Double> list;

    public ChangeHistory() {
        this.list = new ArrayList<>();
    }

    public void add(double status) //adds provided status as the latest amount to remember in the change history.
    {
        this.list.add(status);

    }

    public void clear() //empties the history.
    {
        this.list.removeAll(list);
    }

    public String toString()// returns the string representation of the change history.
    // The string representation provided by the ArrayList class is sufficient.
    {
        return this.list.toString();
    }

    public double maxValue()// returns the largest value in the change history.
    // If the history is empty, the method should return zero.
    {
        if (this.list.isEmpty()) {
            return 0;
        } else {
            double max = 0;
            for (int i = 0; i < this.list.size(); i++) {

                if (this.list.get(i) > max) {
                    max = this.list.get(i);
                }
            }
            return max;
        }
    }

    public double minValue() //returns the smallest value in the change history.
    // If the history is empty, the method should return zero.
    {
        if (this.list.isEmpty()) {
            return 0;
        } else {
            double min = 99999;
            for (int i = 0; i < this.list.size(); i++) {

                if (this.list.get(i) < min) {
                    min = this.list.get(i);
                }
            }
            return min;
        }

    }

    public double average()// returns the average of the values in the change history.
    // If the history is empty, the method should return zero.
    {
        if (this.list.isEmpty()) {
            return 0;
        } else {
            double avg = 0;
            double count=0;
            for (int i = 0; i < this.list.size(); i++) {
                avg += this.list.get(i);
                count++;
            }
            return avg/count;
        }
    }
}


import java.util.HashMap;

public class IOU {
    private HashMap<String, Double> mapa;

    public IOU() {
        this.mapa = new HashMap<>();
    }

    public void setSum(String toWhom, double amount) {
        this.mapa.put(toWhom, amount);
    }

    public double howMuchDoIOweTo(String toWhom) {
        if(this.mapa.containsKey(toWhom)) {
            return this.mapa.get(toWhom);
        }
        return 0;
    }
}

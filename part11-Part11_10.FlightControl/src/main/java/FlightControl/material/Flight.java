package FlightControl.material;

public class Flight {

    private String origin;
    private String target;

    public Flight(String origin, String target) {

        this.origin=origin;
        this.target=target;
    }



    public String getOrigin() {
        return this.origin;
    }

    public String getTarget() {
        return this.target;
    }

    @Override
    public String toString() {
        return "(" + this.origin + "-" + this.target + ")";
    }
}

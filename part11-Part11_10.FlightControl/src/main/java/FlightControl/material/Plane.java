package FlightControl.material;

import java.util.ArrayList;
import java.util.List;

public class Plane {

    private String id;
    private int capacity;
    private List<Flight> flights;

    public Plane(String id, int capacity) {
        this.id=id;
        this.capacity=capacity;
        this.flights=  new ArrayList<>();
    }

    public String getId() {
        return this.id;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void addFlight (Flight flight) {
        this.flights.add(flight);
    }

    public void getFlights () {
        this.flights.stream()
                .forEach(flight -> System.out.println(toString() + " " + flight.toString()));
    }

    @Override
    public String toString() {
        return this.id + " (" + this.capacity + " capacity)";
    }
}


package FlightControl.material;

import java.util.HashMap;
import java.util.Map;

public class Storage {
    private Map<String, Plane> planes;


    public Storage() {
        this.planes= new HashMap<>();

    }

    public void addPlane (Plane plane) {
        this.planes.put(plane.getId(), plane);
    }

    public Plane getPlane (String id) {
        return this.planes.get(id);
    }

    public void printAllPlanes() {
        for (Plane letadlo: this.planes.values()
             ) {
            System.out.println(letadlo.toString());

        }
    }

    public void printAllPlanesAndFlights() {
        for (Plane letadlo: this.planes.values()
        ) {letadlo.getFlights();

        }
    }

}

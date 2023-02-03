import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class VehicleRegistry {
    private HashMap<LicensePlate, String> mapa;

    public VehicleRegistry () {
        this.mapa = new HashMap<LicensePlate, String>();
    }
    public boolean add(LicensePlate licensePlate, String owner) {
        if (this.mapa.containsKey(licensePlate)) return false;
         else this.mapa.put(licensePlate, owner);
         return true;
    }

    public String get(LicensePlate licensePlate) //returns the owner of the car corresponding to the license plate received as
   // a parameter. If the car isn't in the registry, the method returns null.
    {
        if (!this.mapa.containsKey(licensePlate)) {
            return null;
        }
        return this.mapa.get(licensePlate);
    }
    public boolean remove(LicensePlate licensePlate) //removes the license plate and attached data from the registry.
    //The method returns true if removed successfully and false if the license plate wasn't in the registry.
    {
        if (!this.mapa.containsKey(licensePlate)) {
            return false;
        }
        this.mapa.remove(licensePlate);
        return true;
    }
    public void printLicensePlates()//prints the license plates in the registry.
    {
        for (LicensePlate one : this.mapa.keySet()) {
            System.out.println(one);
        }
    }
    public void printOwners() //prints the owners of the cars in the registry.
    //Each name should only be printed once, even if a particular person owns more than one car.
    {
        Set<String> set = new HashSet<String>();
        for (String one : this.mapa.values()) {
            set.add(one);}

        for (String two : set) {
            System.out.println(two);}
}}

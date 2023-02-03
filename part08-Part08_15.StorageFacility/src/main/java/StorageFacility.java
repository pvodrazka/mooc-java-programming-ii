import java.util.ArrayList;
import java.util.HashMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class StorageFacility {

    private HashMap<String, ArrayList<String>> mapa;
    private ArrayList<String> list;

    public StorageFacility() {
        this.mapa = new HashMap<>();
        this.list = new ArrayList<>();
    }

    public void add(String unit, String item) //adds the parameter item to the storage unit that is also given as a parameter.
    {
        this.mapa.putIfAbsent(unit, new ArrayList<>());
        this.mapa.get(unit).add(item);

    }

    public ArrayList<String> contents(String storageUnit)  //returns a list that contains all the items in the storage unit
    // indicated by the parameter.
    // If there is no such storage unit or it contains no items, the method should return an empty list.
    {
        return this.mapa.getOrDefault(storageUnit, new ArrayList<>());

    }

    public void remove(String storageUnit, String item) //removes the given item from the given storage unit. NB!
    // Only removes one item — if there are several items with the same name, the rest still remain.
    // If the storage unit would be empty after the removal, the method also removes the unit.
    {

        String delete;

        for (int i = 0; i < this.mapa.get(storageUnit).size(); i++) {
            delete = this.mapa.get(storageUnit).get(i);
            if (delete.equals(item)) {
                this.mapa.get(storageUnit).remove(i);
                if (this.mapa.get(storageUnit).isEmpty()) {
                    this.mapa.remove(storageUnit);
                }
                break;
            }


        }
    }

    public ArrayList<String> storageUnits()
    //returns the names of the storage units as a list. NB! Only the units that contain items are listed.
    {
        ArrayList<String> list2 = new ArrayList<>();
        for (String key : this.mapa.keySet()) {
            if (!key.isEmpty()) {
                list2.add(key);
            }

        }
        return list2;

    }
}






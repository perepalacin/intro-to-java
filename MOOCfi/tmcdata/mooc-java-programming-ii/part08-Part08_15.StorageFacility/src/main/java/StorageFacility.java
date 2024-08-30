
import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {
 
    private HashMap<String, ArrayList<String>> storageUnits;

    public StorageFacility() {
        this.storageUnits = new HashMap<>();
    }

    public void add(String unit, String item){
        if (this.storageUnits.containsKey(unit)) {
            this.storageUnits.get(unit).add(item);
        } else {
            ArrayList<String> newItemList = new ArrayList<>();
            newItemList.add(item);
            System.out.println(newItemList.toString());
            this.storageUnits.put(unit, newItemList);
        }
    }

    public ArrayList<String> contents(String storageUnit){
        if (this.storageUnits.containsKey(storageUnit) && !this.storageUnits.get(storageUnit).isEmpty()) {
            return this.storageUnits.get(storageUnit);
        } else {
            ArrayList<String> storageUnits = new ArrayList<String>();
            return storageUnits;
        }
    }

    public void remove(String storageUnit, String item) {
        for (String key: this.storageUnits.keySet()) {
            if (this.storageUnits.get(key).contains(item)) {
                this.storageUnits.get(key).remove(item);
                if (this.storageUnits.get(key).isEmpty()) {
                    this.storageUnits.remove(key);
                }
                break;
            }
        }
    }

    public ArrayList<String> storageUnits(){
        ArrayList<String> keys = new ArrayList<>();
        for (String key : this.storageUnits.keySet()) {
            if (!this.storageUnits.get(key).isEmpty()) {
                keys.add(key);
            }
        }
        return keys;
    }
}

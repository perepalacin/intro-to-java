
import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegistry {
    
    private HashMap<LicensePlate, String> registry;

    public VehicleRegistry() {
        this.registry = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner){
        if (this.registry.containsKey(licensePlate)) {
            return false;
        }
        this.registry.put(licensePlate, owner);
        return true;
    }

    public String get(LicensePlate licensePlate){
        return this.registry.getOrDefault(licensePlate, null);
    }

    public boolean remove(LicensePlate licensePlate){
        if (this.registry.containsKey(licensePlate)) {
            this.registry.remove(licensePlate);
            return true;
        }
        return false;
    }

    public void printLicensePlates(){
        for(LicensePlate plate : this.registry.keySet()) {
            System.out.println(plate.toString());
        }
    }

    public void printOwners(){
        ArrayList<String> names = new ArrayList<>();
        for(LicensePlate plate : this.registry.keySet()) {
            if (!names.contains(this.registry.get(plate))) {
                names.add(this.registry.get(plate));
                System.out.println(this.registry.get(plate));
            }
        }    
    }
}

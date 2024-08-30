
import java.util.ArrayList;

public class Box implements Packable {
    private double maxCapacity;
    private ArrayList<Packable> storedItems;

    public Box(double maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.storedItems = new ArrayList<>();
    }

    public void add (Packable item) {
        if (this.weight() + item.weight() <= this.maxCapacity) {
            this.storedItems.add(item);
        }
    }

    @Override
    public double weight() {
        double weight = 0;
        for (Packable storedItem : this.storedItems) {
            weight = weight + storedItem.weight();
        }
        return weight;
    }

    @Override
    public String toString(){
        double currentWeight = 0;
        for (Packable storedItem : this.storedItems) {
            currentWeight = currentWeight + storedItem.weight();
        }
        return ("Box: " + this.storedItems.size() + " items, total weight " + this.weight() + " kg");
    }
}

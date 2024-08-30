
import java.util.ArrayList;


public class BoxWithMaxWeight extends Box {
    
    private int capactity;
    private ArrayList<Item> items;

    public BoxWithMaxWeight(int capacity) {
        this.capactity = capacity;
        this.items = new ArrayList<>();
    }

    @Override
    public boolean isInBox(Item item){
        for (Item storedItem : this.items) {
            if (storedItem.equals(item)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void add(Item item) {
        if (!this.isInBox(item)) {
            int currentWeight = 0;
            for (Item storedItems : this.items) {
                currentWeight = currentWeight + storedItems.getWeight();
            }
            if (currentWeight + item.getWeight() <= this.capactity) {
                this.items.add(item);
            }
        }
    }


}

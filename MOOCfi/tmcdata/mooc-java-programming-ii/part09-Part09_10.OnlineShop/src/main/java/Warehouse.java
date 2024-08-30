
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Warehouse {

    private Map<String, Integer> prices;
    private Map<String, Integer> quantities;

    public Warehouse() {
        this.prices = new HashMap<>();
        this.quantities = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
            if (this.quantities.containsKey(product)) {
                int currentStock = this.quantities.get(product);
                this.quantities.put(product, currentStock + stock);
            } else {
                this.prices.put(product, price);
                this.quantities.put(product, stock);
            }
    }

    public int price(String product) {
        if (prices.containsKey(product)) {
            return this.prices.get(product);
        } 
        return -99;
    }

    public int stock(String product) {
            if (this.quantities.containsKey(product)) {
                return this.quantities.get(product);
            }
        return 0;
    }

    public boolean take(String product) {
            if (this.quantities.containsKey(product)){
                int currentStock = this.quantities.get(product);
                if (currentStock == 1) {
                    this.prices.remove(product);
                    this.quantities.remove(product);
                } else {
                    this.quantities.put(product, currentStock-1);
                }
                return true;
        }
        return false;
    }

    public Set<String> products() {
        return this.prices.keySet();
    }
}

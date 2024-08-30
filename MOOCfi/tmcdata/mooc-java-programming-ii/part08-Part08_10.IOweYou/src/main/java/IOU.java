
import java.util.HashMap;

public class IOU {
    private HashMap<String, Double> iou;

    public IOU() {
        this.iou = new HashMap<>();
    }

    public void setSum(String toWhom, double amount) {
        if (iou.containsKey(toWhom)) {
            double newAmount = iou.get(toWhom) + amount;
            iou.put(toWhom, newAmount);
        } else {
            iou.put(toWhom, amount);
        }
    }

    public double howMuchDoIOweTo(String toWhom) {
        return this.iou.getOrDefault(toWhom, 0.0);
    }
    
}

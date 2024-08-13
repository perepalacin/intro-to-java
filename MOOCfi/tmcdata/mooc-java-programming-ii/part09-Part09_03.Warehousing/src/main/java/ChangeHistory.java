
import java.util.ArrayList;

public class ChangeHistory {
    private ArrayList<Double> history;

    public ChangeHistory() {
        this.history = new ArrayList<>();
    }

    public void add(double status) {
        this.history.add(status);
    }

    public void clear(){
        this.history.clear();
    }

    @Override
    public String toString() {
        return this.history.toString();
    }

    public double maxValue() {
        double max = 0;
        for (double value: this.history) {
            if (value >= max) {
                max = value;
            }
        }
        return max;
    }

    public double minValue() {
        if (this.history.isEmpty()) {
            return 0;
        }
        double min = 10000000;
        for (double value: this.history) {
            if (value <= min) {
                min = value;
            }
        }
        return min;
    }

    public double average(){
        if (this.history.isEmpty()) {
            return 0;
        }

        double sum = 0;
        for (double value : this.history) {
            sum = sum + value;
        }
        
        return sum/this.history.size();
    }
}

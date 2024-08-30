
import java.util.ArrayList;

public class Herd implements Movable {
    
    private ArrayList<Movable> herds;

    public Herd() {
        this.herds = new ArrayList<>();
    }

    @Override
    public String toString(){
        String output = "";
        for (Movable herd : this.herds) {
            output = output + herd.toString() + "\n";
        }
        return output;
    }

    public void addToHerd(Movable movable){
        this.herds.add(movable);
    }

    @Override
    public void move(int dx, int dy) {
        for (Movable herd : this.herds) {
            herd.move(dx, dy);
        }
    }
}

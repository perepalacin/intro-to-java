
import java.util.ArrayList;

public class Hideout<T> {
    
    private ArrayList<T> hidden;

    public void putIntoHideout(T toHide) {
        if (!this.hidden.contains(toHide)) {
            this.hidden.add(toHide);
        } else {
            this.hidden.remove(toHide);
        }
    }

    public T takeFromHideout() {
        
    }


}


import java.util.Date;

public class Items {
    private String name;
    private Date createdAt;

    public Items (String name) {
        this.name = name;
        this.createdAt = new Date();
    }

    @Override
    public String toString() {
        return this.name + " (created at: " + this.createdAt.toString() + ")";
    }
}

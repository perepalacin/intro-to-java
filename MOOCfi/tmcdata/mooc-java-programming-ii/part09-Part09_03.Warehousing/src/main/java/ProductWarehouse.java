public class ProductWarehouse extends  Warehouse {

    private String productName;

    public ProductWarehouse(String name, double capacity) {
        super(capacity);
        this.productName = name;
    }

    public String getName() {
        return this.productName;
    }

    public void setName(String newName) {
        this.productName = newName;
    }

    @Override
    public String toString() {
        return this.productName + ": " + super.toString();
    }
}

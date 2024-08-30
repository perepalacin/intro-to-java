public class Container {
    private int amount;

    public int contains() {
        return this.amount;
    }

    public void add(int amount){
        if (amount > 0) {
            this.amount = amount + this.amount > 100 ? 100 : this.amount + amount;
        }
    }

    public void remove(int amount) {
        if (amount > 0) {
            this.amount = this.amount - amount < 0 ? 0 : this.amount - amount;
        }
    }

    @Override
    public String toString() {
        return this.amount + "/100";
    }
}

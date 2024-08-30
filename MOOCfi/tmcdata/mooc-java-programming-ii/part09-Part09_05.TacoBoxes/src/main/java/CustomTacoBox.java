public class CustomTacoBox implements TacoBox {
    
    private int tacos;

    public CustomTacoBox(int quantity) {
        this.tacos = quantity;
    }

    @Override
    public void eat() {
        if (this.tacos >= 1) {
            this.tacos--;
        }
    }
    
    @Override
    public int tacosRemaining() {
        return this.tacos;
    }
}

public class Counter {
    private int counter;
    public Counter(int startValue) {
        this.counter = startValue;
    }

    public Counter() {
        this.counter = 0;
    }

    public int value() {
        return this.counter;
    }
    public void increase() {
        this.counter++;
    }
    public void decrease() {
        this.counter--;
    }

    public void increase(int num) {
        if (num > 0) {
            this.counter = this.counter + num;
        }
    }
    public void decrease(int num) {
        if (num > 0) {
            this.counter = this.counter - num;
        }
    }

}

public class Timer {
    private ClockHand seconds;
    private ClockHand milesimas;

    public Timer() {
        this.seconds = new ClockHand(60);
        this.milesimas = new ClockHand(100);
    }

    public void advance() {
        this.milesimas.advance();
        if (this.milesimas.value() == 0) {
            this.seconds.advance();
        };
    }

    @Override
    public String toString() {
        return this.seconds + ":" + this.milesimas;
    }
}

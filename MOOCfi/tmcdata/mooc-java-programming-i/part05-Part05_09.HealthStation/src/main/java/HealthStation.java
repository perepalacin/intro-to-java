
public class HealthStation {

    private int weightings;

    public int weigh(Person person) {
        this.weightings++;
        // return the weight of the person passed as the parameter
        return person.getWeight();
    }

    public void feed(Person person) {
        int currentWeight = person.getWeight();
        person.setWeight(currentWeight + 1);
    }

    public int weighings() {
        return this.weightings;
    }

}

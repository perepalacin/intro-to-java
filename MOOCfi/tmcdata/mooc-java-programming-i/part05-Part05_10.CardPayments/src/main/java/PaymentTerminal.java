
public class PaymentTerminal {


    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals


    public PaymentTerminal() {
        this.money = 1000;
        this.affordableMeals = 0;
        this.heartyMeals = 0;
    }

    public double eatAffordably(double payment) {
        if (payment < 2.5) {
            return payment;
        }
        this.money = this.money + 2.5;
        this.affordableMeals++;
        return payment - 2.5;
    }

    public double eatHeartily(double payment) {
        if (payment < 4.3) {
            return payment;
        }
        this.money = this.money + 4.3;
        this.heartyMeals++;
        return payment - 4.3;
    }


    public boolean eatAffordably(PaymentCard card) {
        boolean purchase =  card.takeMoney(2.5);
        if (purchase) {
            this.affordableMeals++;
            return true;
        }
        return false;
    }

    public boolean eatHeartily(PaymentCard card) {
        boolean purchase = card.takeMoney(4.3);
        if (purchase) {
            this.heartyMeals++;
            return true;
        }
        return false;
    }

    public void addMoneyToCard(PaymentCard card, double sum) {
        if (sum > 0) {
            card.addMoney(sum);
            this.money = this.money + sum;
        }
    }


    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}

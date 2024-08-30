
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }

    public void addMeal(String meal) {
        boolean repeated = false;
        for (int i = 0; i < this.meals.size(); i++) {
            if (this.meals.get(i).equals(meal)) {
                repeated = true;
                break;
            }
        }
        if (!repeated) {
            this.meals.add(meal);
        }
    }

    public void printMeals() {
        for (String meal: this.meals) {
            System.out.println(meal);
        }
    }

    public void clearMenu() {
        this.meals.clear();
    }
}

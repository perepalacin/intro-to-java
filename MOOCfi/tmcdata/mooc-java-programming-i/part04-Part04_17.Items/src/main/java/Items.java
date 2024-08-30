
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        // implement here your program that uses the class Item

        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while ( 1 < 2) {
            System.out.println("Name: ");
            String inputName = scanner.nextLine();
            if ("".equals(inputName)) {
                break;
            } else {
                items.add(new Item(inputName));
            }
        }

        for (int i = 0; i < items.size(); i++) {
            System.out.println(items.get(i).toString());
        }

        scanner.close();
    }
}

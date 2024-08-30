
import java.util.ArrayList;
import java.util.Scanner;


public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Items> items = new ArrayList();

        while ( 1 < 2) {
            System.out.println("Name: ");
            String inputName = scanner.nextLine();
            if ("".equals(inputName)) {
                break;
            } else {
                items.add(new Items(inputName));
            }
        }

    }
}

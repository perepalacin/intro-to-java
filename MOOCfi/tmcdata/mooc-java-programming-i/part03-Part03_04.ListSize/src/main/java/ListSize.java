
import java.util.ArrayList;
import java.util.Scanner;

public class ListSize {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cont = 0;
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
            cont = cont + 1;
        }
        System.out.println("In total: " + cont);
        scanner.close();
    }
}

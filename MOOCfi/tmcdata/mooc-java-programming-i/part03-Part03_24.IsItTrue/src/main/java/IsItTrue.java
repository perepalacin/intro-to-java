
import java.util.Scanner;

public class IsItTrue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give a string: ");

        String input = scanner.nextLine();

        System.out.print("\n");

        if ("true".equals(input)) {
            System.out.println("You got it right!");
        } else {
            System.out.println("Try again!");
        }


        scanner.close();
    }
}

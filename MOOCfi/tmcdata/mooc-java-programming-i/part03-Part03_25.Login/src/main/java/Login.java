
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");

        String username = scanner.nextLine();

        System.out.print("\n");

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        System.out.print("\n");

        if ("alex".equals(username) && "sunshine".equals(password)) {
            System.out.println("You have successfully logged in!");
        } else if ("emma".equals(username) && "haskell".equals(password)) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }
        scanner.close();
    }
}

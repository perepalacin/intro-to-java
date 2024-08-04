
import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many days would you like to convert to seconds?");
        int number = Integer.valueOf(scanner.nextLine());
        // int number = scanner.nextInt();
        System.out.println(number*24*60*60);
        // Write your program here
        scanner.close();

    }
}


import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers:");
        Statistics stats = new Statistics();
        Statistics oddStats = new Statistics();
        Statistics evenStats = new Statistics();

        while (1 < 2) {
            int num = scanner.nextInt();
            if (num == -1) {
                break;
            } else {
                stats.addNumber(num);
                if (num % 2 == 0) {
                    evenStats.addNumber(num);
                } else {
                    oddStats.addNumber(num);
                }
            }
        }

        System.out.println("Sum: " + stats.sum());
        System.out.println("Sum of even numbers: " + evenStats.sum());
        System.out.println("Sum of odd numbers: " + oddStats.sum());
        scanner.close();
    }
}

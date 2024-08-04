
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cont = 0;
        while (true) {
            System.out.println("Give a number:");
            int num = scanner.nextInt();
            if (num == 0) {
                break;
            } else {
                cont = cont + num;
            }
        }
        System.out.println("Sum of the numbers: " + cont);

        scanner.close();
    }
}

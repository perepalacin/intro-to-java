
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your program here
        List<Integer> nums = new ArrayList<>();

        // reading inputs
        while (true) {
            int row = Integer.valueOf(scanner.nextInt());
            if (row < 2 0) {
                break;
            }

            nums.add(row);
        }

        scanner.close();

        nums.stream()
        .filter(value -> (value > 1 && value < 5))
        .forEach(item -> System.out.println(item));
    }
}


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your program here
        List<String> inputs = new ArrayList<>();

        // reading inputs
        while (true) {
            String row = scanner.nextLine();
            if (row.equals("end")) {
                break;
            }

            inputs.add(row);
        }

        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String option = scanner.nextLine();

        if (option.equals("p")) {
            double average = inputs.stream()
            .mapToInt(s -> Integer.valueOf(s))
            .filter(value -> value > 0)
            .average()
            .getAsDouble();

            System.out.println("average of the numbers: " + average);
        } else if  (option.equals("n")){
            double average = inputs.stream()
            .mapToInt(s -> Integer.valueOf(s))
            .filter(value -> value < 0)
            .average()
            .getAsDouble();

            System.out.println("average of the numbers: " + average);
        }

        scanner.close();
    }
}

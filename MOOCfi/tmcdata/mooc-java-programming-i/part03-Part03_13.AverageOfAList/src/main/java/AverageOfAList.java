
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (1 < 2) {
            int input = Integer.valueOf(scanner.nextInt());
            if (input == -1) {
                break;
            } else {
                list.add(input);
            }
        }

        int size = 0;
        double average = 0;
        
        for (Integer number: list) {
            average = average + number;
            size++;
        }

        average = average /size;

        System.out.println("Average: " + average);
        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.
        
        scanner.close();
    }
}

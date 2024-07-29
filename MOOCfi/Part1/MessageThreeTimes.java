package MOOCfi.Part1;

import java.util.Scanner;

public class MessageThreeTimes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please provide a message to forward");
        String message = scanner.nextLine();
        scanner.close();
        
        System.out.println(message);
    }
}

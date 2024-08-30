
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Container container1  = new Container();
        Container container2  = new Container();
    

        while (true) {
            System.out.println("First: " + container1.toString());
            System.out.println("Second" + container2.toString());
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");

            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            if ("add".equals(command)) {
                container1.add(amount);
            } else if ("remove".equals(command)) {
                container2.remove(amount);
            } else if ("move".equals(command)) {
                int start = container1.contains();
                container1.remove(amount);
                int end = container1.contains();
                container2.add(start - end);
            }
        }
    }
}


import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary simpleDictionary;

    public TextUI(Scanner scanner, SimpleDictionary simpleDictionary) {
        this.scanner = scanner;
        this.simpleDictionary = simpleDictionary;
    }

    public void start(){
        while (true) { 
            System.out.print("Command:");
            String input  = scanner.nextLine();
            if ("end".equals(input)) {
                System.out.println("Bye bye!");
                break;
            } else {
                System.out.print("\n");
            }
        }
    }
}

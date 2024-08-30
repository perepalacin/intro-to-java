
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many random numbers should be printed?");
        int times = Integer.valueOf(scanner.nextInt());
        Random ladyLuck = new Random(); // create Random object ladyLuck

        for (int i = 0; i < times; i++) {
            int randomNumber = ladyLuck.nextInt(11);
            System.out.println(randomNumber);
        }
    }

}

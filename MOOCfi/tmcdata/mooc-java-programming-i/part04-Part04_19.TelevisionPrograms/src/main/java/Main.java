import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (1<2) {
            System.out.print("Name: ");
            String name = scanner.nextLine();
            if ("".equals(name)) {
                break;
            } 
            System.out.print("Duration: ");
            int duration = Integer.valueOf(scanner.nextInt());
            scanner.nextLine();  // Consume the leftover newline
            programs.add(new TelevisionProgram(name, duration));
        }

        System.out.print("Program's maximum duration? ");
        int maxDuration = Integer.valueOf(scanner.nextInt());

        for (TelevisionProgram program: programs) {
            if (program.getDuration() <= maxDuration) {
                System.out.println(program.toString());
            }
        }

        scanner.close();

    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please introduce an integer");

        int num = sc.nextInt();

        System.out.println("You have entered the number " + num);
        sc.close();
    }    
}

package contents.methods;

import java.util.Scanner;

public class Main {
    public static int calculateSum(int number1, int number2) {
        int sum = number1 + number2;
        return sum;
    }
    
    
    public static void main (String[] args) {
        String name = getUserName();
        GreetUser(name);
    }
    
    public static String getUserName() {
        System.out.println("Hello! What is your name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        scanner.close();
        return name;
    }

    public static void GreetUser(String name) {
        System.out.println("Hello " + name + "!");
    }
}   

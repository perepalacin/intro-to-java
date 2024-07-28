package contents.methods;

import java.util.Scanner;

public class InstantCreditCheck {
    static int requiredSalary = 25000; //Globally scoped variables!
    static int requiredCreditScore = 700;
    static Scanner scanner = new Scanner(System.in); 

    public static void main(String[] args) {
        double salary = getSalary();
        int creditScore = getCreditScore();
        
        boolean qualified = isUserQualidied(salary, creditScore);
        
        scanner.close();
        notifiyUser(qualified);
    }

    public static double getSalary() {
        System.out.println("Enter your salary");
        double salary = scanner.nextDouble();
        return salary;
    }

    public static int getCreditScore() {
        System.out.println("What is your credit score?");
        int creditScore = scanner.nextInt();
        return creditScore;
    }

    public static boolean isUserQualidied(double salary, int creditScore) {
        if (salary >= requiredSalary && creditScore >= requiredCreditScore) {
            return true;
        } else {
            return false;
        }
    }

    public static void notifiyUser(boolean qualified) {
        if (qualified) {
            System.out.println("The user is qualified");
        } else {
            System.out.println("The user is not qualified");
        }
    }
}

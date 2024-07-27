package contents.basics; //This is required

import java.util.Scanner;

public class GrossPayCalculator {
    public static void main(String[] args) {

        //Variable definition

        System.out.println("Hello, how many hours did you work?");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();

        System.out.println("What is your hourly pay rate?");
        double rate = scanner.nextDouble();
        
        double grossPay = hours*rate;
        
        System.out.println("Your gross pay would be: " + grossPay);

        //If statements
        
        if (grossPay > 500) {
            System.out.println("good!");
        } else if (grossPay < 200) {
            System.out.println("Come on you could do better");
        } else {
            System.out.println("Hmm...");
        }
        
        int x = scanner.nextInt();

        //Switch statements

        switch (x) {
            case 0:
                System.out.println(0);
                break;
            case 1:
                System.out.println(1);
            case 2:
                System.out.println("it will print 2 and 3");
            case 3:
                System.out.println(3);
                break;
            case 4: 
                System.out.println(4);
                break;
            default:
                System.out.println("okay...");
                break;
        }

        //Switch expressions

        String message = switch(x) { //Can only be used to asign a value to a variable
            case 1 -> "Excellent job";
            case 2 -> "Not so bad";
            case 3 -> "Eeeh...";
            case 4 -> "Try again...";
            case 5 -> {
                System.out.println("We can include instructions in here,");
                System.out.println("But the last line has to return the value");
                yield "Yield returns the value";
            }
            default -> "Okaaay...";
        };

        System.out.println(message);

        //While loops

        System.out.println("How many hours did you work today?");
        double hoursWorked = scanner.nextDouble();

        while(hoursWorked > 24 || hoursWorked <= 0) {
            System.out.println("Invalid entry, your hours must be between 0 and 24");
            hoursWorked = scanner.nextDouble();
        }

        //Do-while loops

        System.out.println("How many hours did you work today?");
        hoursWorked = scanner.nextDouble();
        
        //the condition is checked after, not really used tho
        do{
            System.out.println("Invalid entry, your hours must be between 0 and 24");
            hoursWorked = scanner.nextDouble();
        }while(hoursWorked > 24 || hoursWorked <= 0);

        //for loops:

        for (int i = 0; i < 12; i++) {
            System.out.println(i);
        }

        for (int i = 12; i < 0; i--) {
            System.out.println(i);
        }


        scanner.close();
    }
}
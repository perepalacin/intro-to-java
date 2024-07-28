package contents.objects;

import java.util.Scanner;

public class HomeAreaCalculator {

    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        // // Default constructor
        // Rectangle room1 = new Rectangle(); 
        // room1.setLength(50);
        // room1.setLength(25);

        // double areaOfRoom1 = room1.calculateArea();

        // // All args constructor
        // Rectangle room2 = new Rectangle(30, 75);
        // double areaOfRoom2 = room2.calculateArea();

        // double totalArea = areaOfRoom1 + areaOfRoom2;
        // System.out.println("Area of both rooms" + totalArea);

        //Just so that we are able to call a non static method inside a static method, we have to reinstantiate our class
        HomeAreaCalculator calculator = new HomeAreaCalculator();
        Rectangle room1 = calculator.getRoom(); 
        Rectangle room2 = calculator.getRoom();
        System.out.println("Area of both rooms" + calculator.calculateAreaOfRoom(room1, room2));


    }
    
    public Rectangle getRoom() {
        System.out.println("Enter the length of your room");
        double length = scanner.nextDouble();

        System.out.println("Enter the width of your room");
        double width = scanner.nextDouble();

        return new Rectangle(length, width);
    }

    public double calculateAreaOfRoom(Rectangle room1, Rectangle room2) {
        return (room1.calculateArea() + room2.calculateArea());
    }
}

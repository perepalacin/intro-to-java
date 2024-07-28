package contents.objects;

public class Rectangle {
    //Encapsulation principles
    private double length;
    private double width;
    private int sides = 4;

    //Constructor
    // //Default constructor == no arguments
    public Rectangle () {
    // By Default, java has a default constructor already built in each class, therefore we do not need it
        // this.width = 0; // We already have a setter method for this!
        // this.length = 0; // Either way is fine! But it is better to use the setters as they are made for this!
        setLength(0);
        setWidth(0);
    }

    // All args constructor
    public Rectangle (double length, double width) {
        setLength(length);
        setWidth(width);
    }

    //Getters and setters:
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double calculatePerimeter () {
        return (2 * (length+width));
    }

    public double calculateArea() {
        return (length*width);
    }
}
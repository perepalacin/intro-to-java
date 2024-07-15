import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        printUntilNumber(12);
        sum(3, 12);
        division(3, 5);
        int[] numbers = {100, 1, 42}; //Short form to define an array;
        listElements(numbers);
    }
    
    public static void printUntilNumber(int numOfTimes) {
        int i = 0;
        while ( i < numOfTimes) {
            System.out.println(i);
            i++;
        }
    }

    public static void sum(int first, int second) {
        System.out.println("The sum of numbers " + first + " and " + second + " is " + (first + second));
    }

    public static void division(float first, float second) {
        System.out.println("The division of numbers " + first + " and " + second + " is " + (first / second));
    }

    public static void TeachersList() {
        ArrayList<String> teachers = new ArrayList<>();

        teachers.add("Simon");
        teachers.add("Samuel");
        teachers.add("Ann");
        teachers.add("Anna");

        //For each loop!
        for (String teacher: teachers) {
            System.out.println(teacher);
        }
    }

    public static void removeElementFromList() {
        ArrayList<String> list = new ArrayList<>();
        list.add("First");
        list.add("Second");
        list.add("Third");

        boolean found = list.contains("First");
        if (found) {
            list.remove("First");
        }

        System.out.println("Index 0 so the first value: " + list.get(0));
        System.out.println("Index 1 so the second value: " + list.get(1));

        //This doesnt work for integers, as it would remove the index! 
        //Therefore we have to do this:
        ArrayList<Integer> intList = new ArrayList<>();

        intList.add(15);
        intList.add(18);
        intList.add(21);
        intList.add(24);

        intList.remove(2);
        intList.remove(Integer.valueOf(15));

        System.out.println("Index 0 so the first value: " + intList.get(0));
        System.out.println("Index 1 so the second value: " + intList.get(1));
    }

    // List as argument
    public static void print(ArrayList<String> list) {
        for (String value: list) {
            System.out.println(value);
        }
    }

    //List as argument + other arguments
    public static void printSmallerThan(ArrayList<Integer> numbers, int threshold) {
        for (int number: numbers) {
            if (number < threshold) {
                System.out.println(number);
            }
        }
    }

    //Array as parameter for a method!
    public static void listElements(int[] integerArray) {
        System.out.println("the elements of the array are: ");
        int index = 0;
        while (index < integerArray.length) {
            int number = integerArray[index];
            System.out.print(number + " ");
            index = index + 1;
        }
    
        System.out.println("");
    }
}




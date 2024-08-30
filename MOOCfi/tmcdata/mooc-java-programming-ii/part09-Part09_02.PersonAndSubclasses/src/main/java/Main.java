import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // write your test code here
    }

    public static void printPersons(ArrayList<Person> persons) {
        for (Person person : persons) {
            // if (person instanceof Student) {
            //     Student casted = (Student) person;
            //     System.out.println(casted.toString());
            // } else if (person instanceof Teacher) {
            //     Teacher casted = (Teacher) person;
            //     System.out.println(casted);
            // } else {
                System.out.println(person.toString());
            // }
        }
    }

}

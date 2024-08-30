
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {

    private ArrayList<Person> employees;

    public Employees() {
        this.employees = new ArrayList<>();
    }

    public void add(Person personToAdd) {
        this.employees.add(personToAdd);
    }

    public void add(List<Person> peopleToAdd) {
        peopleToAdd.forEach(person -> this.employees.add(person));
    }

    public void print(){
        this.employees.forEach(person -> System.out.println(person.toString()));
    }

    public void print(Education education) {
        // this.employees.stream().filter(person -> person.getEducation() == education).forEach(person -> System.out.println(person.toString()));
        Iterator<Person> iterator = this.employees.iterator();

        while (iterator.hasNext()) {
            Person nextInLine = iterator.next();
            if (nextInLine.getEducation() == education) {
                System.out.println(nextInLine.toString());
            }
        }
    }

    public void fire(Education education) {
        Iterator<Person> iterator = this.employees.iterator();

        while (iterator.hasNext()) {
            if (iterator.next().getEducation() == education) {
                iterator.remove();
            }
        }
    }


    
}

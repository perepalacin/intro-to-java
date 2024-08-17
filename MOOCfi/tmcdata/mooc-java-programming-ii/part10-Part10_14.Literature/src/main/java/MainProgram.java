
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Input the name of the book, empty stops: ");
            String continueQ = "";
            if(scanner.hasNextLine()){continueQ = scanner.nextLine();}

            if (continueQ.equals("")) {
                break;
            }

            System.out.print("Input the age recommendation: ");
            int age = Integer.valueOf(scanner.nextInt());

            books.add(new Book(continueQ, age));

            System.out.println("");
        }

        Comparator<Book> comparator = Comparator
              .comparing(Book::getAgeRecommendation)
              .thenComparing(Book::getName);

        Collections.sort(books, comparator);

        for (Book book: books) {
            System.out.println(book);
        }

    }

}

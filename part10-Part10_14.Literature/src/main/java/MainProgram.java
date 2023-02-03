
import java.util.*;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> list = new ArrayList<>();

        while (true) {
            System.out.println("Input the name of the book, empty stops:");
            String kniha = scanner.nextLine();


            if (kniha.isEmpty()) {
                System.out.println(list.size() + " books in total.");
                System.out.println("Books:");
               /* list.stream()
                        .sorted((b1, b2) -> b1.getAge() - b2.getAge())
                        .sorted((b1, b2) -> b1.getName().compareTo(b2.getName()))
                        .forEach(book -> System.out.println(book.toString()));*/
                Comparator<Book> comparator = Comparator
                        .comparing(Book::getAge)
                        .thenComparing(Book::getName);

                Collections.sort(list, comparator);
                list.stream()
                        .forEach(book -> System.out.println(book.toString()));


                break;


            } else {
                System.out.println("Input the age recommendation:");
                int age = Integer.parseInt(scanner.nextLine());
                Book book = new Book(kniha, age);
                list.add(book);

            }


        }
    }

}

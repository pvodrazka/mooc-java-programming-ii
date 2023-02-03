
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

//Add the method public static List<Book> readBooks(String file) for the class BooksFromFile.
// It should read the file given as the parameter and forms book data from it.


public class BooksFromFile {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here

    }
//name,publishing year,page count,author
    public static List<Book> readBooks(String file) {
        List<Book> books = new ArrayList<>();

        try {
            Files.lines(Paths.get(file))
                    // splitting the row into parts on the ";" character
                    .map(row -> row.split(","))
                    // deleting the split rows that have less than two parts (we want the rows to always contain both the name and the birth year)
                    .filter(parts -> parts.length >= 2)
                    // creating persons from the parts
                    .map(parts -> new Book(parts[0], Integer.parseInt(parts[1]), Integer.parseInt(parts[2]), parts[3]))
                    // and finally add the persons to the list
                    .forEach(books::add);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        return books;
    }

}


import java.util.ArrayList;
import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        // Test your program here!
        HashMap<String, Book> hashmap = new HashMap<>();
        hashmap.put("sense", new Book("Sense and Sensibility", 1811, "..."));
        hashmap.put("prejudice", new Book("Pride and prejudice", 1813, "...."));

        printValues(hashmap);
        System.out.println("---");
        printValueIfNameContains(hashmap, "prejud");
    }

    public static void printValues(HashMap<String, Book> hashmap) {
        //which prints all the values in the hashmap given as a parameter using the toString method of the Book objects.
        //ArrayList<String> list = new ArrayList<>();
        for (Book value : hashmap.values()
        ) {
            System.out.println((value.toString()));

        }

    }

    public static void printValueIfNameContains(HashMap<String, Book> hashmap, String text) {
        //which prints only the Books in the given hashmap which name contains the given string. You can find out the name of a Book with the method getName.
        //ArrayList<String> list = new ArrayList<>();
        for (Book value : hashmap.values()
        ) {if (value.getName().contains(text))
        {
            System.out.println((value.toString()));}

        }
    }
}

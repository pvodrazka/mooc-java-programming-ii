
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
//Implement the static method public static List<String> read(String file),
// which reads the file with the filename of the parameter and returns the lines as a string list.

public class ReadingFilesPerLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test the method here

    }

    public static List<String> read(String file) {
        List<String> rows = new ArrayList<>();

        try {
            Files.lines(Paths.get(file)).forEach(rows::add);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        return rows;
    }

}

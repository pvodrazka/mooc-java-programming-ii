
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LiteracyComparison {

    public static void main(String[] args) {

        try {
            Files.lines(Paths.get("literacy.csv"))
                    .map(x -> x.split(","))
                    .sorted((x, y) -> x[5].compareTo(y[5]))
                    .forEach(x -> System.out.println(x[3] + " (" + x[4] + "), " + x[2].split(" ")[1].trim() + ", " + x[5]));
            //Adult literacy rate, population 15+ years, female (%),United Republic of Tanzania,2015,76.08978
            //Niger (2015), female, 11.01572
        }
        catch (IOException error) {

            System.out.println("There was an issue reading the file " + error.getMessage());
        }

    }

}


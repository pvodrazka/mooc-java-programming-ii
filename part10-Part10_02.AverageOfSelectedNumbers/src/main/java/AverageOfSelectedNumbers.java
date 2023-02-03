
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        List<String> list = new ArrayList<>();

        System.out.println("Input numbers, type \"end\" to stop.");
        while (true) {
            String input = String.valueOf(scanner.nextLine());

            if (input.equals("end")) {
                break;
            } else list.add(input);

        }
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String input2=String.valueOf(scanner.nextLine());
        if (input2.equals("n")){
            double averageN = list.stream()
                    .mapToInt(Integer::valueOf)
                    .filter(number ->  number<0)
                    .average()
                    .getAsDouble();
            System.out.println("Average of the positive numbers: " + averageN);
        }

        else if (input2.equals("p")){
            double averageP = list.stream()
                    .mapToInt(Integer::valueOf)
                    .filter(number ->  number>0)
                    .average()
                    .getAsDouble();
            System.out.println("Average of the positive numbers: " + averageP);
        }
    }
}

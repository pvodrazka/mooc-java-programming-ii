
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LimitedNumbers {
    //Write a program that reads user input. When the user gives a negative number as an input,
    // the input reading will be stopped. After this, print all the numbers the user has given as input that are between 1 and 5


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList();
        while (true) {
            int input = Integer.parseInt(scanner.nextLine());
            if (input<0) {
                break;
            }
            list.add(input);

        }
        list.stream()
                .filter(s -> s >= 1 && s <= 5)
                .forEach(System.out::println);


    }
}

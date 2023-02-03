
import java.util.*;
import java.util.stream.Collectors;

public class PositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here

    }

    public static List<Integer> positive(List<Integer> numbers)//
    // , which receives an ArrayList of integers, and returns the positive integers from the list.
    {

        List<Integer>output = numbers.stream()
                .filter(s -> s > 0)
                .collect(Collectors.toList());
        return output;
    }
}

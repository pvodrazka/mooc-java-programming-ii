
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result;
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            result = Integer.valueOf(input);
            result = result*result*result;
            System.out.println(result);
        }


    }
}

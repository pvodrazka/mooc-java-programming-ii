
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int pocet = 0;
        while (true) {
            int cislo = Integer.valueOf(scanner.nextLine());
            if (cislo == 0) {
                break;
            } else if (cislo > 0) {
                count += cislo;
                pocet++;

            }

        }
        if (pocet == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println(count*1.0/pocet);
        }
    }
}
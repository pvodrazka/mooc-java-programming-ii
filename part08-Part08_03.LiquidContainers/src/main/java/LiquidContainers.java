
import java.util.Scanner;

public class LiquidContainers {



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container first = new Container();
        Container second = new Container();


        while (true) {
            System.out.println("First: " + first.contains() + "/100");
            System.out.println("Second: " + second.contains() + "/100");

            String input = scan.nextLine();
            if (input.equals("quit")) {

                break;
            } else if (input.startsWith("add")) {
                String[] parts = input.split(" ");

                String command = parts[0];
                int amount = Integer.valueOf(parts[1]);
                if (amount <0) {

                    continue;
                }
                first += amount;
                if (first > 100) {
                    first = 100;
                }

            } else if (input.startsWith("move")) {
                String[] parts = input.split(" ");

                String command = parts[0];
                int amount = Integer.valueOf(parts[1]);
                if (amount <0) {
                    System.out.println("First: " + first + "/100");
                    System.out.println("Second: " + second + "/100");
                    continue;
                }
                if (amount >= first) {
                    second = second + first;
                    first = 0;
                } else if (first > amount) {
                    second = second + amount;
                    first = first - amount;

                }
                if (second > 100) {
                    second = 100;
                }

            } else if (input.startsWith("remove")) {
                String[] parts = input.split(" ");

                String command = parts[0];
                int amount = Integer.valueOf(parts[1]);
                if (amount <0) {
                    System.out.println("First: " + first + "/100");
                    System.out.println("Second: " + second + "/100");
                    continue;
                }
                second = second - amount;
                if (second < 0) {
                    second = 0;
                }

            }

 /*   public void addAmount(int number) {
first += number;
if (first > 100) {
    first=100;
}
    }

    public void moveAmount (int number) {
        if (number > first) {
            second= second + first;
            first =0;
        }
        else if (first > number) {
            second = second + number;
            first = first - number;

        }
        if (second > 100)
        {
        second = 100;
    }

}
public void removeAmount (int number) {
        second = second - number;
        if (second < 0) {
            second=0;
        }
} */
        }
    }
}

import java.util.Scanner;

public class UserInterface {
    private Container jedna;
    private Container dva;
    private Scanner scanner;

    public UserInterface() {
        this.jedna = new Container();
        this.dva = new Container();
        this.scanner = new Scanner(System.in);
    }

    public void start() {

        while (true) {
            System.out.println("First: " + this.jedna.contains() + "/100");
            System.out.println("Second: " + this.dva.contains() + "/100");

            String input = this.scanner.nextLine();
            if (input.equals("quit")) {

                break;
            } else if (input.startsWith("add")) {
                String[] parts = input.split(" ");

                String command = parts[0];
                int amount = Integer.valueOf(parts[1]);
                jedna.add(amount);

            } else if (input.startsWith("move")) {
                String[] parts = input.split(" ");
                String command = parts[0];
                int amount = Integer.valueOf(parts[1]);
                int first = this.jedna.contains();
                int second = this.dva.contains();


                if (amount < 0) {
                    System.out.println("First: " + this.jedna.contains() + "/100");
                    System.out.println("Second: " + this.dva.contains() + "/100");
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
                this.jedna.setStock(first);
                this.dva.setStock(second);
            }

            else if (input.startsWith("remove")) {
                String[] parts = input.split(" ");

                String command = parts[0];
                int amount = Integer.valueOf(parts[1]);
                if (amount < 0) {
                    System.out.println("First: " + this.jedna.contains() + "/100");
                    System.out.println("Second: " + this.dva.contains() + "/100");
                    continue;
                }
                this.dva.remove(amount);
                }

            }

        }
    }


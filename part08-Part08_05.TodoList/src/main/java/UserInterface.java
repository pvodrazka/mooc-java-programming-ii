import java.util.Scanner;

public class UserInterface {
    private TodoList seznam;
    private Scanner scanner;

    public UserInterface (TodoList seznam, Scanner scanner) {
        this.seznam=seznam;
        this.scanner=scanner;
    }

    public void start() {
        while (true) {
            System.out.println("Command:");
            String command = this.scanner.nextLine();
            if (command.equals("stop")) {
                break;
            }
            if (command.equals("add")) {
                System.out.println("To add:");
                String toAdd = this.scanner.nextLine();
                this.seznam.add(toAdd);
            }
            if (command.equals("list")) {
               this.seznam.print();
            }
            if (command.equals("remove")) {
                System.out.println("Which one is removed?");
                int toRemove = Integer.valueOf(this.scanner.nextLine());
                this.seznam.remove(toRemove);
            }
        }
    }
}

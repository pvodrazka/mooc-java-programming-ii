package FlightControl.ui;

import FlightControl.material.Flight;
import FlightControl.material.Plane;
import FlightControl.material.Storage;

import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private Storage storage;

    public UserInterface() {
        this.scanner = new Scanner(System.in);
        this.storage = new Storage();
    }

    public void start() {
        System.out.println("Airport Asset Control");
        System.out.println("--------------------");
        System.out.println();

        while (true) {
            System.out.println("Choose an action:");
            System.out.println("[1] Add an airplane");
            System.out.println("[2] Add a flight");
            System.out.println("[x] Exit Airport Asset Control");

            System.out.print("> ");

            String input = String.valueOf(scanner.nextLine());
            if (input.equals("x")) {
                break;
            } else if (input.equals("1")) {
                System.out.print("Give the airplane id: ");
                String id = String.valueOf(scanner.nextLine());
                System.out.print("Give the airplane capacity: ");
                int capacity = Integer.parseInt(scanner.nextLine());
                Plane plane = new Plane(id, capacity);
                this.storage.addPlane(plane);

            } else if (input.equals("2")) {

                System.out.print("Give the airplane id: ");
                String id = String.valueOf(scanner.nextLine());
                System.out.println("Give the departure airport id: ");
                String origin = String.valueOf(scanner.nextLine());
                System.out.println("Give the target airport id: ");
                String target = String.valueOf(scanner.nextLine());
                Flight flight = new Flight(origin, target);
                this.storage.getPlane(id).addFlight(flight);
            }
        }
        System.out.println();
        druhaCast();
    }

    public void druhaCast() {
        System.out.println("Flight Control");
        System.out.println("------------");
        System.out.println();

        while (true) {
            System.out.println("Choose an action:");
            System.out.println("[1] Print airplanes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print airplane details");
            System.out.println("[x] Quit");

            System.out.print("> ");
            String input = String.valueOf(scanner.nextLine());
            if (input.equals("x")) {
                break;
            } else if (input.equals("1")) {
                this.storage.printAllPlanes();

            } else if (input.equals("2")) {
                this.storage.printAllPlanesAndFlights();

            } else if (input.equals("3")) {
                System.out.println("Give the airplane id: ");
                String id = String.valueOf(scanner.nextLine());
                System.out.println(this.storage.getPlane(id));

            }

        }

    }
}

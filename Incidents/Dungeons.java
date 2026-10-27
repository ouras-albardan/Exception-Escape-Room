package Incidents;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Dungeons {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int playerEnergy = 10;

        try {
            startGame(scanner);

            // Bonus: Test the heavy door
            openHeavyDoor(playerEnergy);

        } catch (InputMismatchException e) {
            System.out.println("Please enter a whole number!");

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());

        } catch (NotEnoughEnergyException e) {
            System.out.println(e.getMessage());

        } finally {
            System.out.println("Game round finished!");
        }

        scanner.close();
    }

    public static void startGame(Scanner scanner) {

        System.out.println("Welcome to Dungeon Escape!");
        System.out.println("You see three doors.");

        chooseDoor(scanner);
    }

    public static void chooseDoor(Scanner scanner) {

        System.out.print("Choose door 1, 2 or 3: ");

        int door = scanner.nextInt();

        openDoor(door);
    }

    public static void openDoor(int door) {

        if (door < 1 || door > 3) {
            throw new IllegalArgumentException(
                "Invalid door! Choose between 1 and 3."
            );
        }

        switch (door) {
            case 1:
                System.out.println("You found treasure!");
                break;

            case 2:
                System.out.println("A dragon attacks you!");
                break;

            case 3:
                System.out.println("You escaped the dungeon!");
                break;
        }
    }

    public static void openHeavyDoor(int energy)
            throws NotEnoughEnergyException {

        if (energy < 20) {
            throw new NotEnoughEnergyException(
                "You need at least 20 energy to open the door!"
            );
        }

        System.out.println("The heavy door opens!");
    }
}
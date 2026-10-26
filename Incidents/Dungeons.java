package Incidents;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Dungeons {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try{
            
            startGame(scanner);
        }catch(InputMismatchException e){
            System.out.println("Please enter a whole number!");
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("Game over");
        }
        scanner.close();

    
    }

    public static void startGame(Scanner scanner) {

        System.out.println("Welcome to the Dungeon Escape Room!");
        System.out.println("You find yourself in a dark dungeon with three doors.");

        chooseDoor(scanner);

    }

    public static void chooseDoor(Scanner scanner) {

        System.out.println("Choose a door to open (1, 2, or 3):");

        int door = scanner.nextInt();

        openDoor(door);

     
    }

    public static void openDoor(int door) {

        if(door < 1 ||  door > 3){
            throw new IllegalArgumentException("Invalid door number! Please choose 1, 2, or 3.");
        }

        switch (door) {
            case 1:
                System.out.println("You found a treasure chest!" +  "\nCONGRATULATIONS!" + "\nYOU WINNNN!");
                break;
            case 2:
                System.out.println("A monster attacks you!" +  "\nOH NO!!" + "\nYOU LOSE!");
                break;
            case 3:
                System.out.println("You find a secret passage and escape!" +  "\nCONGRATULATIONS!" + "\nYOU WINNN!");
                break;
        }
        
    }
    
}

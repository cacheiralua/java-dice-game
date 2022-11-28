import java.io.IOException;
//import java.lang.Thread;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static String option;
    private static final ArrayList<Game> gameList= new ArrayList<>();
    private static final Scanner keyboard = new Scanner(System.in);

    public static void clearScreen(){
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (InterruptedException | IOException e) {
            System.out.println("a");
        }
    }

    public static void createMenuScreen(){
        clearScreen();
        System.out.println("****************************************");
        System.out.println("********* Mega Hyper Dice Game *********");
        System.out.println("************** Main  Menu **************");
        System.out.println("****************************************");
        System.out.println("*             1- Start                 *");
        System.out.println("*             2- Players               *");
        System.out.println("*             3- Exit                  *");
        System.out.println("****************************************");
        System.out.print("*             ->");
        option = keyboard.nextLine();
        switch (option) {
            case "1" -> createGameMenuScreen();
            case "2" -> playerMenuScreen();
            case "3" -> System.exit(1);
            default -> {
            }
        }
    }

    public static void createGameMenuScreen() {
        clearScreen();
        System.out.println("****************************************");
        System.out.println("********* Mega Hyper Dice Game *********");
        System.out.println("************ Creating  Game ************");
        System.out.println("****************************************");
        System.out.println("****************************************");
        System.out.println("*             1- Start Game            *");
        System.out.println("*             2- Choose Players        *");
        System.out.println("*             3- Return                *");
        System.out.println("****************************************");
        option = keyboard.nextLine();
        switch (option) {
            case "1" -> createGameMenuScreen();
            case "2" -> playerMenuScreen();
            case "3" -> System.exit(1);
            default -> {
            }
        }
    }
    public static void playerMenuScreen() {
        clearScreen();
        System.out.println("****************************************");
        System.out.println("********* Mega Hyper Dice Game *********");
        System.out.println("**************** Player ****************");
        System.out.println("****************************************");
        System.out.println("****************************************");
        System.out.println("*             1- List                  *");
        System.out.println("*             2- Create                *");
        System.out.println("*             3- Remove                *");
        System.out.println("*             4- Main Menu             *");
        System.out.println("****************************************");
        option = keyboard.nextLine();
        switch (option) {
            case "1" -> createGameMenuScreen();
            case "2" -> playerMenuScreen();
            case "3" -> System.exit(1);
            default -> {
            }
        }

    }

    public static void main(String[] args) {
        while (true) {
            createMenuScreen();
        }
    }
}
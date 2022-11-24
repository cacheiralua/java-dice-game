import java.io.IOException;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static String option;
    private static ArrayList<Game> gameList= new ArrayList<>();
    private static Scanner keyboard = new Scanner(System.in);
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static void clearScreen(){
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (InterruptedException | IOException e) {

        }
    }

    public static void createMenuScreen(){
        clearScreen();
        System.out.println(ANSI_GREEN + "****************************************" + ANSI_RESET);
        System.out.println(ANSI_GREEN + "*********" + ANSI_CYAN + " Mega Hyper Dice Game *********" + ANSI_RESET);
        System.out.println(ANSI_GREEN + "**************" + ANSI_CYAN + " Main  Menu **************" + ANSI_RESET);
        System.out.println(ANSI_GREEN + "****************************************" + ANSI_RESET);
        System.out.println(ANSI_GREEN + "*             "+ ANSI_PURPLE + "1- Start                 "+ ANSI_GREEN + "*" + ANSI_RESET);
        System.out.println(ANSI_GREEN + "*             "+ ANSI_PURPLE + "2- Players               "+ ANSI_GREEN + "*" + ANSI_RESET);
        System.out.println(ANSI_GREEN + "*             "+ ANSI_PURPLE + "3- Exit                  "+ ANSI_GREEN + "*" + ANSI_RESET);
        System.out.println(ANSI_GREEN + "****************************************" + ANSI_RESET);
        option = keyboard.nextLine();
        switch(option) {
            case "1":
                createGameMenuScreen();
                break;
            case "2":
                playerMenuScreen();
                break;
            case "3":
                System.exit(1);
                break;

            default:
                break;



        }
    }

    public static void createGameMenuScreen() {
        clearScreen();
        System.out.println(ANSI_GREEN + "****************************************" + ANSI_RESET);
        System.out.println(ANSI_GREEN + "********* " + ANSI_CYAN + "Mega Hyper Dice Game" + ANSI_GREEN + " *********" + ANSI_RESET);
        System.out.println(ANSI_GREEN + "************ " + ANSI_CYAN + "Creating  Game" + ANSI_GREEN + " ************" + ANSI_RESET);
        System.out.println(ANSI_GREEN + "****************************************" + ANSI_RESET);
        System.out.println(ANSI_GREEN + "****************************************" + ANSI_RESET);
        System.out.println(ANSI_GREEN + "*             " + ANSI_PURPLE + "1- Start Game" + ANSI_GREEN + "            *" + ANSI_RESET);
        System.out.println(ANSI_GREEN + "*             " + ANSI_PURPLE + "2- Choose Players" + ANSI_GREEN + "        *" + ANSI_RESET);
        System.out.println(ANSI_GREEN + "*             " + ANSI_PURPLE + "3- Return" + ANSI_GREEN + "                *" + ANSI_RESET);
        System.out.println(ANSI_GREEN + "****************************************" + ANSI_RESET);
        option = keyboard.nextLine();
    }
    public static void playerMenuScreen() {
        clearScreen();
        System.out.println(ANSI_GREEN + "****************************************" + ANSI_RESET);
        System.out.println(ANSI_GREEN + "********* " + ANSI_CYAN + "Mega Hyper Dice Game" + ANSI_GREEN + " *********" + ANSI_RESET);
        System.out.println(ANSI_GREEN + "**************** " + ANSI_CYAN + "Player" + ANSI_GREEN + " ****************" + ANSI_RESET);
        System.out.println(ANSI_GREEN + "****************************************" + ANSI_RESET);
        System.out.println(ANSI_GREEN + "****************************************" + ANSI_RESET);
        System.out.println(ANSI_GREEN + "*             " + ANSI_PURPLE + "1- List                  " + ANSI_GREEN + "*" + ANSI_RESET);
        System.out.println(ANSI_GREEN + "*             " + ANSI_PURPLE + "2- Create                " + ANSI_GREEN + "*" + ANSI_RESET);
        System.out.println(ANSI_GREEN + "*             " + ANSI_PURPLE + "3- Remove                " + ANSI_GREEN + "*" + ANSI_RESET);
        System.out.println(ANSI_GREEN + "*             " + ANSI_PURPLE + "4- Main Menu             " + ANSI_GREEN + "*" + ANSI_RESET);
        System.out.println(ANSI_GREEN + "****************************************" + ANSI_RESET);

    }

    public static void main(String[] args) throws InterruptedException {
        while (true) {
            createMenuScreen();
        }

    }

}
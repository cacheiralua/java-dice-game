/**
 * Esta classe tem como função criar um jogador.
 *
 * @author João Cacheira e Rúben Monteiro
 * @version 0.0.1
 */
import java.util.ArrayList;


/**
 * The Game class is the main class of the game. It contains the playerList, diceHistory, playerHistory
 * and the gameIsFinished boolean
 */
public class Game {


    // : Atributos da classe Game:
    private ArrayList<Player> playerList = new ArrayList<Player>();
    private ArrayList<Player> playerHistory = new ArrayList<Player>();
    private ArrayList<Integer> diceHistory = new ArrayList<Integer>();
    private boolean gameIsFinished;
    private boolean gameIsStarted;
    private Dice dice;

    // Creating a new game.
    public Game() {
        this.gameIsFinished = false;
        this.gameIsStarted = false;
        this.dice = new Dice();
    }

    // : Métodos Seletores
    /**
     * .This function returns the value of the gameIsFinished variable
     *
     * @return The gameIsFinished variable is being returned.
     */
    public boolean getGameIsFinished() {
        return this.gameIsFinished;

    }

    /**
     * .This function returns the number of players in the game
     *
     * @return The number of players in the playerList.
     */
    public int getNumberOfPlayers() {
        return this.playerList.size();
    }

    /**
     * .This function returns the value of the diceHistory variable
     *
     * @return The diceHistory variable is being returned.
     */
    public ArrayList<Integer> getDiceHistory() {
        return this.diceHistory;
    }

    /**
     * .This function returns the value of the playerHistory variable
     *
     * @return The playerHistory variable is being returned.
     */
    public ArrayList<Player> getPlayerHistory() {
        return this.playerHistory;
    }

    /**
     * .This function returns the value of the playerList variable
     *
     * @return The playerList variable is being returned.
     */
    public ArrayList<Player> getPlayerList() {
        return this.playerList;
    }

    // : Métodos Modificadores
    /**
     * .This function adds a player to the playerList
     *
     * @param player The player that is being added to the playerList.
     */
    public void addPlayer(Player player) {
        this.playerList.add(player);
    }

    /**
     * .This function removes a player from the playerList
     *
     * @param player The player that is being removed from the playerList.
     */
    public void removePlayer(Player player) {
        this.playerList.remove(player);
    }

    /**
     * .This function adds a number to the diceHistory
     *
     * @param dice The number that is being added to the diceHistory.
     */
    public void addDiceHistory(int dice) {
        this.diceHistory.add(dice);
    }

    /**
     * .This function adds a player to the playerHistory
     *
     * @param player The player that is being added to the playerHistory.
     */
    public void addPlayerHistory(Player player) {
        this.playerHistory.add(player);
    }

    /**
     * .This function rolls the dice and adds the result to the diceHistory
     *
     * @return The number that was rolled.
     */
    public int rollDice() {
        int dice = this.dice.rollDice();
        this.addDiceHistory(dice);
        return dice;
    }

    /**
     * .This function ends the game
     */
    public void endGame() {
        this.gameIsFinished = true;
    }

    /**
     * .This function starts the game
     */
    public void startGame() {
        this.gameIsStarted = false;
    }

    // : Métodos Modificadores



}


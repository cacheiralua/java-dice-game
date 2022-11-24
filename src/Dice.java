/**
 * The Dice class is used to generate a random number between 1 and 6
 *
 * @author João Cacheira e Rúben Monteiro
 * @version 0.0.1
 */
import java.util.Random;
/**
 * The Dice class is used to generate a random number between 1 and 6
 */
public class Dice {
    private static int lastRoll;
    private Random dice;

    // .It's a constructor.
    public Dice() {
        this.dice = new Random();
        lastRoll = 0;
    }

    /**
     * The function rollDice() returns a random number between 1 and 6
     *
     * @return The last roll of the dice.
     */
    public int rollDice() {
        lastRoll = dice.nextInt(6) + 1;
        return lastRoll;
    }

    /**
     * .This function returns the last roll of the dice
     *
     * @return The last roll of the dice.
     */
    public int getLastRoll() {
        return lastRoll;
    }
}

import jdk.internal.access.JavaLangInvokeAccess;

/**
 * Esta classe tem como função criar um jogador.
 *
 * @author João Cacheira e Rúben Monteiro
 * @version 0.0.1
 */
public class Player {

    /**
     * * Data: 14/11/2022
     * * Pessoa: João Cacheira
     * * Feito: Crição da class, atributos, contrutor e metodos seletores.
     * * Notas: n/a
     */

    // : Atributos da classe Player
    private String name;
    private int points;
    private int victories;
    private boolean playedGames;

    // : Metodo Contrutor que recebe o nome do jogador como parâmetro
    public Player(String name) {
        this.name = name;
        this.points = 0;
        this.victories = 0;
        this.playedGames = false;
    }

    // : Métodos Seletores

    /**
     * .This function returns the name of the player
     *
     * @return The name of the player.
     */
    public String getName() {
        return this.name;
    }

    /**
     * .This function returns the points of the person
     *
     * @return The points of the person.
     */
    public int getPoints() {
        return this.points;
    }

    /**
     * .This function returns the number of victories of the player
     *
     * @return The number of victories.
     */
    public int getVictories() {
        return this.victories;
    }

    /**
     * .This function returns the value of the variable playedGames
     *
     * @return The value of the variable playedGames.
     */
    public boolean getPlayedGames() {
        return this.playedGames;
    }
}

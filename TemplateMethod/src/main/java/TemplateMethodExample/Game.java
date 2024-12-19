package TemplateMethodExample;

/**
 * The abstract Game class defines the template method and the structure for playing a game.
 * It uses the Template Method design pattern to define the algorithm skeleton while allowing
 * subclasses to customize specific steps.
 */
public abstract class Game {

    /**
     * Template method that defines the skeleton of the game-playing algorithm.
     * It calls several abstract methods that must be implemented by subclasses.
     */
    public void play() {
        System.out.println("Starting new game...");

        // Step 1: Initialize the game
        initialize();

        // Step 2: Start the game
        startGame();

        // Step 3: Play individual turns
        playTurn();

        // Step 4: Check for a winner
        checkForWinner();

        // Step 5: End the game
        endGame();
    }

    /**
     * Abstract method to initialize the game.
     * Subclasses must provide their own implementation.
     */
    protected abstract void initialize();

    /**
     * Abstract method to start the game.
     * Subclasses must provide their own implementation.
     */
    protected abstract void startGame();

    /**
     * Abstract method to play a single turn in the game.
     * Subclasses must provide their own implementation.
     */
    protected abstract void playTurn();

    /**
     * Abstract method to check for a winner.
     * Subclasses must provide their own implementation.
     */
    protected abstract void checkForWinner();

    /**
     * Abstract method to end the game.
     * Subclasses must provide their own implementation.
     */
    protected abstract void endGame();
}

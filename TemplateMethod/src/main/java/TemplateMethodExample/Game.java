package TemplateMethodExample;

public abstract class Game {
    public void play() {
        System.out.println("Starting new game...");
        initialize();
        startGame();
        playTurn();
        checkForWinner();
        endGame();

    }

    protected abstract void initialize();

    protected abstract void startGame();

    protected abstract void playTurn();

    protected abstract void checkForWinner();

    protected abstract void endGame();


}

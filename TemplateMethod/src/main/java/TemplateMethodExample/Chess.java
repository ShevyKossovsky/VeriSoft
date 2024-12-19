package TemplateMethodExample;

public class Chess extends Game{
    @Override
    protected void initialize() {
        System.out.println("Initializing Chess Game...");
    }

    @Override
    protected void startGame() {
        System.out.println("Starting Game...");
    }

    @Override
    protected void playTurn() {
        System.out.println("Playing turn...");
    }

    @Override
    protected void checkForWinner() {
        System.out.println("Checking for winner...");
    }

    @Override
    protected void endGame() {
        System.out.println("Ending Game...");
    }
}

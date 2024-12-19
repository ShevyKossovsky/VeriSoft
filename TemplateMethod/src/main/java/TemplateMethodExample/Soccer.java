package TemplateMethodExample;

public class Soccer extends Game {
    @Override
    protected void initialize() {
        System.out.println("Initializing Soccer Game...");
    }

    @Override
    protected void startGame() {
        System.out.println("Starting Game...");
    }

    @Override
    protected void playTurn() {
        System.out.println("Playing Turn...");
    }

    @Override
    protected void checkForWinner() {
        System.out.println("Checking for Winner...");
    }

    @Override
    protected void endGame() {
        System.out.println("Ending Game...");
    }
}

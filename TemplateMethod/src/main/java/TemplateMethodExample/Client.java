package TemplateMethodExample;

/**
 * The Client class demonstrates the use of the Template Method design pattern.
 * It creates instances of different games (Chess and Soccer) and plays them
 * using the shared algorithm defined in the abstract Game class.
 */
public class Client {

    /**
     * Main method - the entry point for the application.
     *
     * @param args Command-line arguments (not used in this example).
     */
    public static void main(String[] args) {
        // Create an instance of a Chess game
        Game chessGame = new Chess();
        // Play the chess game using the template method
        chessGame.play();

        // Create an instance of a Soccer game
        Game soccerGame = new Soccer();
        // Play the soccer game using the template method
        soccerGame.play();
    }
}

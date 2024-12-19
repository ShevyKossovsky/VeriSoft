package TemplateMethodExample;

public class Client {
    public static void main(String[] args) {
        Game chessGame = new Chess();
        chessGame.play();
        Game soccerGame = new Soccer();
        soccerGame.play();
    }
}

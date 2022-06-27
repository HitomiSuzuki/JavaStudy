package guessNumberGame;

import guessNumberGame.logic.GuessNumberGameLogic;

public class GuessNumberGame {
    public static void main(String[] args) {
        GuessNumberGameLogic game = new GuessNumberGameLogic();

        game.startGame();
    }
}
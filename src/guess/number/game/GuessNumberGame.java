package guess.number.game;

import guess.number.game.logic.GuessNumberGameLogic;

public class GuessNumberGame {
    public static void main(String[] args) {
        GuessNumberGameLogic game = new GuessNumberGameLogic();

        game.startGame();
    }
}
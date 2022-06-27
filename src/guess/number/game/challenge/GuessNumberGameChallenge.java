package guessNumberGameChallenge;

import guessNumberGameChallenge.logic.GuessNumberGameChallengeLogic;

public class GuessNumberGameChallenge {
    public static void main(String[] args) {
        GuessNumberGameChallengeLogic game = new GuessNumberGameChallengeLogic();

        game.startGame();
    }
}
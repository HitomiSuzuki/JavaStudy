package guess.number.game.challenge;

import guess.number.game.challenge.logic.GuessNumberGameChallengeLogic;

public class GuessNumberGameChallenge {
    public static void main(String[] args) {
        GuessNumberGameChallengeLogic game = new GuessNumberGameChallengeLogic();

        game.startGame();
    }
}
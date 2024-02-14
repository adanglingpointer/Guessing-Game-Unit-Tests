package cloud.imail.game;

import java.util.Random;

public class GuessingGame {
    private final int randomNumber = new Random().nextInt(10) + 1;
    private int counter = 0;

    public String guess(int guessedNumber) {
        counter++;
        if (counter == 4 && guessedNumber != getRandomNumber()) {
            return "You didn't get it and you've had four tries. Game over.";
        }
        String winningMsg = String.format("You got it in %d try", counter);
        return guessedNumber == getRandomNumber() ? winningMsg : "You didn't get it";
    }

    public int getRandomNumber() {
        return randomNumber;
    }
}

package cloud.imail.game;

import java.util.Random;

public class GuessingGame {
    private final int randomNumber = new Random().nextInt(10) + 1;
    private int counter = 0;

    public String guess(int guessedNumber) {
        counter++;
        String tryText = counter == 1 ? "try" : "tries";
        String winningMsg = String.format("You got it in %d %s", counter, tryText);
        String response = null;
        if (counter == 4 && guessedNumber != getRandomNumber()) {
            response =  String.format("You didn't get it and you've had %d %s. Game over.", counter, tryText);
        } else if (counter > 4) {
            response = "Sorry, you are limited to only 4 tries. Game over.";
        } else {
            response =  guessedNumber == getRandomNumber() ? winningMsg : "You didn't get it";
        }
        return response;
    }

    public int getRandomNumber() {
        return randomNumber;
    }
}

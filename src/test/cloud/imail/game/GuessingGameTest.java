package cloud.imail.game;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GuessingGameTest {

    @Test
    public void testSimpleWinSituation() {
        GuessingGame game = new GuessingGame();
        int randomNum = game.getRandomNumber();
        String message = game.guess(randomNum);
        assertEquals("You got it", message);
    }

    @Test
    public void testOneWrongNegGuessSituation() {
        GuessingGame game = new GuessingGame();
        String message = game.guess(-5);
        assertEquals("You didn't get it", message);
    }

    @Test
    public void testOneWrongPosGuessSituation() {
        GuessingGame game = new GuessingGame();
        int randomNum = game.getRandomNumber();
        String message = game.guess(randomNum + 1);
        assertEquals("You didn't get it", message);
    }
}

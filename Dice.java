/**
 * Created by Cule on 11/23/2016.
 */
import java.util.Random;

public class Dice {
    public static int thrownDice(int numberOfDice)
    {
        int diceReturns = 0;

        Random random = new Random();

        for (int i = 0; i < numberOfDice; i++)
        {
            int randomNumber = random.nextInt(6) + 1;
            diceReturns += randomNumber;
        }

        return diceReturns;
    }
}

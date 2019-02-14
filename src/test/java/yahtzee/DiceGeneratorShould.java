package yahtzee;

import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class DiceGeneratorShould {
    @Test
    void return_list_of_n_dice_rolls() {
        var expectedHand = asList(1,2,3,4,5);
        var dice = mock(Dice.class);
        when(dice.roll()).thenReturn(1,2,3,4,5);
        var diceGenerator = new DiceGenerator(dice);

        List<Integer> actualHand = diceGenerator.rollTimes(5);

        assertEquals(expectedHand, actualHand);
    }

}
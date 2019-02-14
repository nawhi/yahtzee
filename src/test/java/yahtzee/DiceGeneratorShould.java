package yahtzee;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class DiceGeneratorShould {

    private Dice dice;
    private DiceGenerator diceGenerator;

    @BeforeEach
    void setUp() {
        dice = mock(Dice.class);
        diceGenerator = new DiceGenerator(dice);
    }

    @Test
    void return_list_of_5_dice_rolls() {
        var expectedHand = asList(1,2,3,4,5);
        when(dice.roll()).thenReturn(1,2,3,4,5);

        List<Integer> actualHand = diceGenerator.rollTimes(5);

        assertEquals(expectedHand, actualHand);
    }

    @Test
    void return_list_of_3_dice_rolls() {
        var expectedHand = asList(4,6,2);
        when(dice.roll()).thenReturn(4,6,2);

        List<Integer> actualHand = diceGenerator.rollTimes(3);

        assertEquals(expectedHand, actualHand);
    }

}
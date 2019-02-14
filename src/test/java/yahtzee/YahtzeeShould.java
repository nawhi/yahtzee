package yahtzee;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

class YahtzeeShould {
    private DiceGenerator diceGenerator;
    private YahtzeePrinter yahtzeePrinter;
    private Yahtzee yahtzee;

    //print category header
    //make call to dice generator
    //print results of first roll
    //ask for dice to re-run [1]
    //print results of updated results
    //ask for dice to re-run [2]
    //print results of updated results
    //print category score
    //print game results

    @BeforeEach
    void setUp() {
        yahtzeePrinter = mock(YahtzeePrinter.class);
        diceGenerator = mock(DiceGenerator.class);
        yahtzee = new Yahtzee(yahtzeePrinter, diceGenerator);
    }

    @Test
    void Tell_Printer_To_Print_Category_Header() {
        yahtzee.run();

        verify(yahtzeePrinter).printCategoryHeader(YahtzeeCategory.Ones);
    }

    @Test
    void Make_Call_To_Dice_Generator() {
        yahtzee.run();

        verify(diceGenerator).rollTimes(5);
    }

    @Test
    void tell_printer_to_print_hand_of_dice() {
        List<Integer> hand = asList(1, 2, 3, 4, 5);
        when(diceGenerator.rollTimes(5)).thenReturn(hand);

        yahtzee.run();

        verify(yahtzeePrinter).printHand(hand);
    }
}
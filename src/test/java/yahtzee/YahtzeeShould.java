package yahtzee;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class YahtzeeShould {

    //print category header
    //make call to dice generator
    //print results of first roll
    //ask for dice to re-run [1]
    //print results of updated results
    //ask for dice to re-run [2]
    //print results of updated results
    //print category score
    //print game results

    @Test
    void Tell_Printer_To_Print_Category_Header() {
        var dice = mock(Dice.class);
        var yahtzeePrinter = mock(YahtzeePrinter.class);
        var yahtzee = new Yahtzee(yahtzeePrinter, dice);

        yahtzee.run();

        verify(yahtzeePrinter).printCategoryHeader(YahtzeeCategory.Ones);
    }
}
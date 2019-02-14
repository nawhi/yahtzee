package yahtzee;

import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class YahtzeePrinterShould {

    @Test
    void print_category_it_was_given() {
        var console = mock(YahtzeeConsole.class);
        var printer = new YahtzeePrinter(console);

        printer.printCategoryHeader(YahtzeeCategory.Ones);

        verify(console).printLine("Category: Ones");
    }

    @Test
    void print_a_hand_of_dice() {
        YahtzeeConsole console = mock(YahtzeeConsole.class);
        YahtzeePrinter printer = new YahtzeePrinter(console);

        List<Integer> hand = asList(2, 4, 1, 6, 1);
        printer.printHand(new DiceHand(hand));

        verify(console).printLine("Dice: A:2 B:4 C:1 D:6 E:1");
    }
}
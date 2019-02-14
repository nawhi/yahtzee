package yahtzee.acceptance;

import org.junit.jupiter.api.Test;
import yahtzee.Dice;
import yahtzee.Yahtzee;
import yahtzee.YahtzeeConsole;

import static org.mockito.Mockito.*;

class AT_OnesTwosAndThrees {

    @Test
    void score_Ones_category() {
        YahtzeeConsole console = mock(YahtzeeConsole.class);

        Dice dice = mock(Dice.class);
        when(dice.roll()).thenReturn(2, 4, 1, 6, 1, 1, 5, 2, 1, 5);

        new Yahtzee(console, dice).run();

        verify(console).printLine("Category: Ones");

        verify(console).printLine("Dice: A:2 B:4 C:1 D:6 E:1");
        verify(console).printLine("[1] Dice to re-run:");
        when(console.readLine()).thenReturn("A B D");

        verify(console).printLine("Dice: A:1 B:5 C:1 D:2 E:1");

        verify(console).printLine("[2] Dice to re-run:");
        when(console.readLine()).thenReturn("B D");

        verify(console).printLine("Dice: A:1 B:1 C:1 D:5 E:1");
        verify(console).printLine("Category Ones score: 4");

        verify(console).printLine("Yahtzee score");
        verify(console).printLine("Ones: 4");
    }
}

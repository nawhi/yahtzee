package yahtzee;

import org.junit.jupiter.api.Test;

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
}
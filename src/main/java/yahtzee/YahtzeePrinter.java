package yahtzee;

import java.util.List;

public class YahtzeePrinter {
    private YahtzeeConsole console;

    public YahtzeePrinter(YahtzeeConsole console) {
        this.console = console;
    }

    void printCategoryHeader(YahtzeeCategory category) {
        console.printLine("Category: " + category.displayName());
    }

    void printHand(List<Integer> hand) {
        throw new UnsupportedOperationException("TODO");
    }
}

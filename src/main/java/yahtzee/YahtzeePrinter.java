package yahtzee;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.lang.String.format;

public class YahtzeePrinter {
    private YahtzeeConsole console;

    public YahtzeePrinter(YahtzeeConsole console) {
        this.console = console;
    }

    void printCategoryHeader(YahtzeeCategory category) {
        console.printLine("Category: " + category.displayName());
    }

    void printHand(DiceHand hand) {
        console.printLine("Dice: " + formatHand(hand));
    }

    private String formatHand(DiceHand hand) {
        var dice = IntStream.range(0, 5)
                .mapToObj(i -> format("%s:%d", letterFor(i), hand.get(i)))
                .collect(Collectors.toList());

        return String.join(" ", dice);
    }

    private char letterFor(int i) {
        return "ABCDE".charAt(i);
    }
}

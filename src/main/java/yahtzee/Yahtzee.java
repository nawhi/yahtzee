package yahtzee;

public class Yahtzee {
    private final YahtzeePrinter printer;
    private final Dice dice;

    public Yahtzee(YahtzeePrinter printer, Dice dice) {
        this.printer = printer;
        this.dice = dice;
    }

    public void run() {
        printer.printCategoryHeader(YahtzeeCategory.Ones);
    }
}

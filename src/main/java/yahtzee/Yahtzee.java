package yahtzee;

public class Yahtzee {
    private final YahtzeePrinter printer;
    private DiceGenerator diceGenerator;

    public Yahtzee(YahtzeePrinter printer, DiceGenerator diceGenerator) {
        this.printer = printer;
        this.diceGenerator = diceGenerator;
    }

    public void run() {
        printer.printCategoryHeader(YahtzeeCategory.Ones);
        printer.printHand(new DiceHand(diceGenerator.rollTimes(5)));
    }
}

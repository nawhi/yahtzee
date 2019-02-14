package yahtzee;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DiceGenerator {
    private Dice dice;

    public DiceGenerator(Dice dice) {
        this.dice = dice;
    }

    List<Integer> rollTimes(int times) {
        return IntStream.range(0, times)
                .map(i -> dice.roll())
                .boxed()
                .collect(Collectors.toList());
    }
}

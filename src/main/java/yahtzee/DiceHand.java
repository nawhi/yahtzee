package yahtzee;

import java.util.List;
import java.util.Objects;

public class DiceHand {
    private List<Integer> rolls;

    DiceHand(List<Integer> rolls) {
        this.rolls = rolls;
    }

    int get(int element) {
        return rolls.get(element);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DiceHand diceHand = (DiceHand) o;
        return Objects.equals(rolls, diceHand.rolls);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rolls);
    }
}

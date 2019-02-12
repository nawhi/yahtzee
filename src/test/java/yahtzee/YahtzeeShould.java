package yahtzee;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class YahtzeeShould {

    @Test
    void exist() {
        new Yahtzee().run();
    }

}

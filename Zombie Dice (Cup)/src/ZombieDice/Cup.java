package ZombieDice;

import java.util.concurrent.ThreadLocalRandom;

public class Cup {
    public String DiceType() {
        int percent1 = ThreadLocalRandom.current().nextInt(1, 100 + 1);
        String Dice = new String();
        if (percent1 < 46) {
            Dice = "Green";
        } else if (percent1 > 77) {
            Dice = "Red";
        } else {
            Dice = "Yellow";
        }
        return Dice;
    }
}
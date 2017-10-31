package team.zombie;

import java.util.Random;

public class Cup {

    public String DiceType() {
        Random random = new Random();
        int percent1 = random.nextInt(101);
        String dice;
        if (percent1 < 46) {
            dice = "Green";
            System.out.println(Dice.greenDie());
        } else if (percent1 > 77) {
            dice = "Red";
            System.out.println(Dice.redDie());
        } else {
            dice = "Yellow";
            System.out.println(Dice.yellowDie());
        }
        return dice;
    }
}

package team.zombie;

import java.util.Random;

public class Cup {

    public static Dice DiceType() {
        Random random = new Random();
        Dice die = new Dice();
        int percent1 = random.nextInt(101);
        String dice;
        if (percent1 < 46) {
            dice = "Green";
            die.setColor(dice);
            die.setType(die.greenDie());
          //  System.out.println(die.greenDie());
        } else if (percent1 > 77) {
            dice = "Red";
            die.setColor(dice);
            die.setType(die.redDie());
            //System.out.println(die.redDie());
        } else {
            dice = "Yellow";
            die.setColor(dice);
            die.setType(die.yellowDie());
           // System.out.println(die.yellowDie());
        }
        return die;
    }
}

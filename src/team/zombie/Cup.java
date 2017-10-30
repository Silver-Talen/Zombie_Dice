package team.zombie;

import java.util.concurrent.ThreadLocalRandom;

class Cup {
    private Cup() {
    }

    private String DiceType() {
        int percent1 = ThreadLocalRandom.current().nextInt(1, 101);
        new String();
        String Dice;
        if (percent1 < 46) {
            Dice = "Green";
        } else if (percent1 > 77) {
            Dice = "Red";
        } else {
            Dice = "Yellow";
        }

        return Dice;
    }
    private class CupReturn {
        private CupReturn() {
        }

        public void main(String[] args) {
            Cup DiceOutput = new Cup();
            DiceOutput.DiceType();
            System.out.println(DiceOutput.DiceType());
        }
    }
}

package team.zombie;

import java.util.Random;

class Dice {

    private String type;
    private String color;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    static String greenDie() {

        Random difficulty = new Random();
        String result = null;
        int diceroll;

        diceroll = difficulty.nextInt(6) + 1;
        if (diceroll < 4) {
            result = "Brains";
        } else if (diceroll > 3 && diceroll < 6) {
            result = "Footprints";
        } else {
            result = "Blast";
        }
        return result;
    }
    static String yellowDie(){

        Random difficulty = new Random();
        String result = null;
        int diceroll;

        diceroll = difficulty.nextInt(6) + 1;
        if (diceroll <= 2) {
            result = "Brains";
        }
        if (diceroll > 2 && diceroll < 5) {
            result = "Footprints";
        }
        if (diceroll <= 6 && diceroll > 4) {
            result = "Blast";
        }
        return result;
    }
    static String redDie(){

        Random difficulty = new Random();
        String result = null;
        int diceroll;

        diceroll = difficulty.nextInt(6)+1;
        if(diceroll == 1){
            result = "Brains";
        }
        if(diceroll >1 && diceroll < 4 ){
            result = "Footprints";
        }
        if(diceroll > 3){
            result = "Blast";
        }
        return result;
    }
}

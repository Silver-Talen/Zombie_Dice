package team.zombie;

import java.util.Random;

public class Dice {

        String color = "";
        int diceroll = 0;
        String result = "";
        boolean fpKeep = false;
        private Random difficulty = new Random();
        int testerino = difficulty.nextInt(100)+1;
        public void dice(){


            int initialChance = testerino;
            if(initialChance <= 46){
                color = "Green";
                System.out.println(color);
                diceroll = difficulty.nextInt(6)+1;
                if(diceroll <= 3){
                    result = "Brains";
                    System.out.println(result);
                }
                if(diceroll >3 && diceroll < 6 ){
                    result = "Footprints";
                    fpKeep = true;
                    System.out.println(result);
                }
                if(diceroll == 6){
                    result = "Blast";
                    System.out.println(result);
                }
            }
            if(initialChance >46 && initialChance < 77){
                color = "Yellow";
                System.out.println(color);
                diceroll = difficulty.nextInt(6)+1;
                if(diceroll <= 2){
                    result = "Brains";
                    System.out.println(result);
                }
                if(diceroll >2 && diceroll < 5 ){
                    result = "Footprints";
                    fpKeep = true;
                    System.out.println(result);
                }
                if(diceroll <= 6 && diceroll > 4){
                    result = "Blast";
                    System.out.println(result);
                }
            }
            if(initialChance >76){
                color = "Red";
                System.out.println(color);
                diceroll = difficulty.nextInt(6)+1;
                if(diceroll == 1){
                    result = "Brains";
                    System.out.println(result);
                }
                if(diceroll >1 && diceroll < 4 ){
                    result = "Footprints";
                    fpKeep=true;
                    System.out.println(result);
                }
                if(diceroll > 3){
                    result = "Blast";
                    System.out.println(result);
                }
            }
        }
        public String getResult(){
            return result;
        }

        public boolean getFp(){return fpKeep; }

        public String getColor() {return color; }

    }



package team.zombie;

import java.util.Scanner;

class Play_Game {

    static void Game() {

        Scanner scanner = new Scanner(System.in);

        String input;
        boolean keepPlaying = true;
        boolean select = true;

        System.out.println("Welcome to Zombie Dice!!\n");

        do {
            Player_Sheet Player1 = new Player_Sheet();
            Player_Sheet Player2 = new Player_Sheet();
            Dice Dice = new Dice();
            String Brains = "Brains";
            String Blast = "Blast";
            String Footprints = "Footprints";
            Player_Sheet[] playerSheets = new Player_Sheet[2];
            String[] fp = new String[3];
            String p1 = "";
            String p2 = "";

            System.out.println("What is the name of player 1:");
            p1 = scanner.nextLine();
            Player1.setName(p1, 1);

            System.out.println("What is the name of player 2:");
            p2 = scanner.nextLine();
            Player2.setName(p2, 2);

            playerSheets[0] = Player1;
            playerSheets[1] = Player2;

            boolean rollAgain = true;
            boolean gameRunning = true;
            boolean alive = true;
            boolean fpKeep = false;
            Cup cup = new Cup();
            Dice die1 = Cup.DiceType();
            Dice die2 = Cup.DiceType();
            Dice die3 = Cup.DiceType();
gameLoop:
            while (gameRunning) {

                for (Player_Sheet p : playerSheets) {

                    alive = true;

                    do {
                        System.out.println("\n" + p.getName() + "\n");

                        for (int i = 0; i < 3; i++) {
                                Dice die = null;

                                if (i ==0) {
                                    die = die1;
                                }
                                if (i ==1) {
                                die = die2;
                                }
                                if (i ==2) {
                                die = die3;
                                }

                            //if statements for if the roll was footprints or not
                            if (!die.getType().equalsIgnoreCase("footprints")) {
                                if (i ==0) {
                                    die1 = Cup.DiceType();
                                }
                                if (i ==1) {
                                    die2 = Cup.DiceType();
                                }
                                if (i ==2) {
                                    die3 = Cup.DiceType();
                                }
                            }
                            else {
                                if (die.getColor().equalsIgnoreCase("red")) {
                                    die.setType(die.redDie());
                                }
                                if (die.getColor().equalsIgnoreCase("green")) {
                                    die.setType(die.greenDie());
                                }
                                if (die.getColor().equalsIgnoreCase("yellow")) {
                                    die.setType(die.yellowDie());
                                }
                            }
                            System.out.println(die.getColor() + ": " + die.getType());

                            if (die.getType().equalsIgnoreCase("brains")) {
                                p.setSurvivorsCornered(p.getSurvivorsCornered() + 1);
                            }
                            else if (die.getType().equalsIgnoreCase("blast")) {
                                p.setShots(p.getShots() + 1);
                            }
                            else if (die.getType().equalsIgnoreCase("footprints")) {
                            }
                        }
                            System.out.println("\nBrains eaten: " + p.getBrainsEaten());
                            System.out.println("Times shot: " + p.getShots());
                            System.out.println("Survivors cornered: " + p.getSurvivorsCornered());
                            System.out.println("");

                            rollAgain = true;

                        if (p.getShots() >=3) {
                            System.out.println("You got blasted and lost your victims :(");
                            alive = false;
                            rollAgain = false;
                            p.setShots(0);
                            p.setSurvivorsCornered(0);
                        }


                        while(rollAgain){
                        if (alive) {
                            System.out.println("Would you like to continue? Y/N");
                            String cont = scanner.nextLine();

                            if (cont.equalsIgnoreCase("N")) {
                                rollAgain = false;
                                alive = false;
                                p.setBrainsEaten(p.getSurvivorsCornered() + p.getBrainsEaten());
                                p.setShots(0);
                                p.setSurvivorsCornered(0);
                            } else if (cont.equalsIgnoreCase("Y")) {
                                rollAgain = false;
                                alive = true;
                            } else {
                                System.out.println("Invalid input, please try again.\n");
                            }
                            if (Player1.getBrainsEaten() >= 13) {
                                System.out.println(Player1.getName() + " WINS!!!");
                                break gameLoop;
                            }
                            if (Player2.getBrainsEaten() >= 13) {
                                System.out.println(Player2.getName() + " WINS!!!");
                                break gameLoop;
                            }
                        }
                        }
                    }while (alive);
                }
                select = true;
            }
        while (select) {
            System.out.println("\nWould you like to play again Y/N?");
            input = scanner.nextLine();

            if (input.equalsIgnoreCase("y")) {
                select = false;
            } else if (input.equalsIgnoreCase("n")) {
                select = false;
                keepPlaying = false;
            } else {
                System.out.println("\nInvalid input, please try again.");
            }
        }
        }while (keepPlaying);
    }

}

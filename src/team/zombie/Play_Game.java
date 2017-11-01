package team.zombie;

import java.util.Scanner;

class Play_Game {

    static void Game() {

        Scanner scanner = new Scanner(System.in);
        String input;
        boolean keepPlaying = true;
        boolean select = true;
        do {
            System.out.println("Welcome to Zombie Dice!!");

//Declaration of items for the entire game
            Player_Sheet Player1 = new Player_Sheet();
            Player_Sheet Player2 = new Player_Sheet();
            Dice Dice = new Dice();
            String Brains = "Brains";
            String Blast = "Blast";
            String Footprints = "Footprints";
            Player_Sheet[] playerSheets = new Player_Sheet[2];

//Getting player information
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

//Setting values for Do While loop
            boolean gameRunning = true;
            boolean alive = true;
            boolean fpKeep = false;
            Cup cup = new Cup();
            Dice die;

            while (gameRunning) {
                //make it display the stats for each player

                for (Player_Sheet p : playerSheets) {
                    alive = true;

                    do {

                        System.out.println("");
                        System.out.println(p.getName());


                        for (int i = 0; i < 3; i++) {
                            //do if statements for if the roll was footprints or not

                            die = Cup.DiceType();
                            System.out.println(die.getColor() + ": " + die.getType());

                            if (die.getType().equalsIgnoreCase("brains")) {
                                p.setSurvivorsCornered(p.getSurvivorsCornered() + 1);
                            } else if (die.getType().equalsIgnoreCase("blast")) {
                                p.setShots(p.getShots() + 1);
                            } else if (die.getType().equalsIgnoreCase("footprints")) {
                                fpKeep = true;
                                //make an array length of 3 and save the color of the die and roll again
                            }

                        }
                    System.out.println("\nBrains eaten: " + p.getBrainsEaten());
                    System.out.println("Times shot: " + p.getShots());
                    System.out.println("Survivors cornered: " + p.getSurvivorsCornered());
                    System.out.println("");

                        if (p.getShots() >=3) {
                            alive = false;
                            p.setShots(0);
                            p.setSurvivorsCornered(0);
                        }
                        if (p.getBrainsEaten() >= 13) {
                            System.out.println("You win!");
                            alive = false;
                        }
                        if (alive) {
                            System.out.println("Would you like to continue? Y/N");
                            String cont = scanner.nextLine();

                            if (cont.equalsIgnoreCase("N")) {
                                alive = false;
                                p.setBrainsEaten(p.getSurvivorsCornered()+p.getBrainsEaten());
                                p.setShots(0);
                                p.setSurvivorsCornered(0);
                            } else if (cont.equalsIgnoreCase("Y")) {
                                alive = true;
                            } else {
                                System.out.println("Invalid input, please try again");
                            }
                        }
                }while (alive) ;
                }



                //til player wins continue







            }
        while (select) {
            System.out.println("Would you like to play again Yes/No?");
            input = scanner.nextLine();

            if (input.equalsIgnoreCase("yes")) {
                select = false;
            } else if (input.equalsIgnoreCase("no")) {
                select = false;
                keepPlaying = false;
            } else {
                System.out.println("Invalid input, please try again.");
            }
        }
        }while (keepPlaying);
    }

}

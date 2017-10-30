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


            Player_Sheet Player1 = new Player_Sheet();
            Player_Sheet Player2 = new Player_Sheet();
            Dice Dice = new Dice();
            String Brains = "Brains";
            String Blast = "Blast";
            String Footprints = "Footprints";

            String p1 = "";
            String p2 = "";
            System.out.println("What is the name of player 1:");
            p1 = scanner.nextLine();
            Player1.setName(p1, 1);
            System.out.println("What is the name of player 2:");
            p2 = scanner.nextLine();
            Player2.setName(p2, 2);

            boolean gameRunning =true;
            boolean alive =true;
            Cup die1 = new Cup();
            Cup die2 = new Cup();
            Cup die3 = new Cup();

            while (gameRunning) {
                //make it display the stats for each player


                do {
                    System.out.println(Player1.getName());
                    System.out.println(Player1.getBrainsEaten());
                    System.out.println(Player1.getShots());
                    System.out.println(Player1.getSurvivorsCornered());

                    System.out.println(Dice.getResult());
                    System.out.println(Dice.getResult());
                    System.out.println(Dice.getResult());


                    for (int i = 1; i < 3; i++) {
                        if (Dice.result.equals(Brains)) {
                            Player1.setBrainsEaten(+1);
                        }
                        else if (Dice.result.equals(Blast)) {
                            Player1.setShots(+1);
                        }
                        else if (Dice.result.equals(Footprints)) {
                            Dice.fpKeep = true;
                        }
                    }
                    if (Player1.getShots() >= 3) {
                        alive = false;
                    }

                    System.out.println("Would you like to continue? Y/N");
                    String cont = scanner.nextLine();

                    if (cont.equalsIgnoreCase("N")) {
                        alive = false;
                    } else if (cont.equalsIgnoreCase("Y")) {
                        alive = true;
                    } else {
                        System.out.println("Invalid input, please try again");
                    }
                    }while (alive);
                        alive = true;
                do {
                    System.out.println(Player2.getName());
                    System.out.println(Player2.getBrainsEaten());
                    System.out.println(Player2.getShots());
                    System.out.println(Player2.getSurvivorsCornered());

                    System.out.println(Dice.getResult());
                    System.out.println(Dice.getResult());
                    System.out.println(Dice.getResult());
                    //Keep footprint dice

                    for (int i = 1; i < 3; i++) {
                        if (Dice.result.equals(Brains)) {
                            Player2.setBrainsEaten(+1);
                        }
                        else if (Dice.result.equals(Blast)) {
                            Player2.setShots(+1);
                        }
                        else if (Dice.result.equals(Footprints)) {
                            Dice.fpKeep = true;
                        }
                    }
                    if (Player2.getShots() >= 3) {
                        alive = false;
                    }

                    System.out.println("Would you like to continue? Y/N");


                }while (alive);




                //til player wins continue





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
            }
        }while (keepPlaying);
    }

}
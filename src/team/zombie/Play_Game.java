package team.zombie;

import java.util.Scanner;

class Play_Game {

    static void Game() {

        Scanner scanner = new Scanner(System.in);
        String input;
        boolean keepPlaying = true;
        boolean select = true;
        do {
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


            Player_Sheet Player1 = new Player_Sheet();

            Dice Dice = new Dice();

            String p1 = "";
            String p2 = "";
            System.out.println("What is the name of player 1:");
            p1 = scanner.nextLine();
            Player1.setName(p1, 1);
            System.out.println("What is the name of player 2:");
            p2 = scanner.nextLine();
            //send this data to the player class to store
            //call default player data

            boolean gameRunning;
            boolean alive;
            while (gameRunning) {
                //make it display the stats for each player

                System.out.println(Player1);
                do {


                    while (alive) {

                        Dice.dice();

                        //each individual turn for the player
                        //call dice/cup for the dice rolls
                        //then set/change stats for player
                        //Runs til they say they want to stop or they get shot 3 times

                    }

                    //til player wins continue

                }
            }

        }while (keepPlaying);
    }

}
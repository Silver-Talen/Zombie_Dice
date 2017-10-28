package team.zombie;

import java.util.Scanner;

class Play_Game {

    static void Game() {
        Scanner Scanner = new Scanner(System.in);
        Player_Sheet Player = new Player_Sheet();
        Dice Dice = new Dice();

        String p1 = "";
        String p2 = "";
        System.out.println("What is the name of player 1:");
        p1 = Scanner.nextLine();
        System.out.println("What is the name of player 2:");
        p2 = Scanner.nextLine();
        //send this data to the player class to store
        //call default player data

        boolean gameRunning = true;
        boolean alive = true;
        while (gameRunning) {
            //make it display the stats for each player

            System.out.println(Player);
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


    }

}
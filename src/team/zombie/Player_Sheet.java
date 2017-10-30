package team.zombie;

class Player_Sheet {

    static void player() {
        int Shots = 0;
        int BrainsEatenP1 = 0;
        int BrainsEatenP2 = 0;
        int SurvivorsCornered = 0;
        boolean turn = true;
        boolean turntwo = true;

        while (turn) {
            //Player 1
            System.out.println(p1);
            System.out.println("Shots: " + Shots);
            System.out.println("Survivors Cornered: " + SurvivorsCornered);

            System.out.println("Brains Eaten: " + BrainsEatenP1);
        }
//______________________________________________________________________________________________
        while (turntwo) {
            //Player 2
            System.out.println(p2);
            System.out.println("Shots: " + Shots);
            System.out.println("Survivors Cornered: " + SurvivorsCornered);

            System.out.println("Brains Eaten: " + BrainsEatenP2);
        }
    }
}

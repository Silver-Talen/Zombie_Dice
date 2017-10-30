package team.zombie;

class Player_Sheet {

    private int Shots = 0;
    private int BrainsEaten = 0;
    private int SurvivorsCornered = 0;
    private String name = "";

    public String getName() {
        return name;
    }

    public void setName(String name, int playerNum) {
        if(name.isEmpty()){
            this.name = "Player " + playerNum;
        }else{
            this.name = name;
        }

    }

    public int getShots() {
        return Shots;
    }

    public void setShots(int shots) {
        Shots = shots;
    }

    public int getBrainsEaten() {
        return BrainsEaten;
    }

    public void setBrainsEaten(int brainsEaten) {
        if(brainsEaten >= 0){
            BrainsEaten = brainsEaten;
        }
    }

    public int getSurvivorsCornered() {
        return SurvivorsCornered;
    }

    public void setSurvivorsCornered(int survivorsCornered) {
        SurvivorsCornered = survivorsCornered;
    }

//    void player() {
//
//        int BrainsEatenP2 = 0;
//        int SurvivorsCornered = 0;
//        boolean turn = true;
//        boolean turntwo = true;
//
//        while (turn) {
//            //Player 1
//            System.out.println(p1);
//            System.out.println("Shots: " + Shots);
//            System.out.println("Survivors Cornered: " + SurvivorsCornered);
//
//            System.out.println("Brains Eaten: " + BrainsEatenP1);
//        }
////______________________________________________________________________________________________
//        while (turntwo) {
//            //Player 2
//            System.out.println(p2);
//            System.out.println("Shots: " + Shots);
//            System.out.println("Survivors Cornered: " + SurvivorsCornered);
//
//            System.out.println("Brains Eaten: " + BrainsEatenP2);
//        }
//    }
}

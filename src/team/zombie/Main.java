package team.zombie;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String input;
        boolean keepPlaying = true;

        do {
            Play_Game.Game();

            boolean select = true;

            while (select) {
                System.out.println("Would you like to play again Yes/No?");
                input = scan.nextLine();

                if (input.equalsIgnoreCase("yes")) {
                    select = false;
                } else if (input.equalsIgnoreCase("no")) {
                    select = false;
                    keepPlaying = false;
                } else {
                    System.out.println("Invalid input, please try again.");
                }
            }
        } while (keepPlaying);

    }
}

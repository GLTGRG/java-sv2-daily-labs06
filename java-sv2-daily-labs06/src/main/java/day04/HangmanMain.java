package day04;

import java.util.Scanner;

public class HangmanMain {

    public static void main(String[] args) {
        new HangmanMain().run();
    }

    private void run() {
        BusinessModel businessModel = new BusinessModel("szarvasmarha",8);
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Itt tartasz: " + businessModel.getWordFound());
            System.out.println("Ennyi tipped van " + businessModel.getChances());
            System.out.println("Mi a kovetkezo tipped?");

            String guess = scanner.nextLine();

            boolean success = businessModel.takeGuess(guess);

            if (success){
                System.out.println("Jo!");
            } else {
                System.out.println("Rossz!");
            }
        } while(!businessModel.won() && businessModel.hasMoreChance());

        if (businessModel.won()){
            System.out.println("Ugyes!");
        } else {
            System.out.println("Vesytettel!");
        }
    }
}

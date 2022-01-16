package day01;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        PositiveNumberContainer pnc = new PositiveNumberContainer();

        Scanner scanner = new Scanner(System.in);

        double actual;

        do{
            actual = scanner.nextDouble();
            if (actual>0){
                pnc.addNumber(actual);
            }
        } while (actual>0);

        System.out.println(pnc.getNumber());
    }
}

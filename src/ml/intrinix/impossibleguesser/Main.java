package ml.intrinix.impossibleguesser;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        do {
            int random = GenRandomNumber();
            System.out.print("Guess a number from 1 to 10: ");
            int guesser = scanner.nextInt();

            if (guesser >= 1 && guesser <= 10) {
                while (random == guesser) {
                    if (random == guesser) {
                        random = GenRandomNumber();
                    }
                }
                if (random != guesser) {
                    System.out.println("Incorrect!");
                    System.out.println("Sorry! The randomly generated number was " + random);
                }
                if (random == guesser) {
                    System.out.println("Congratulation! You did the unthinkable.);
                    break;
                }
            } else {
                System.out.println("Out of Range! Enter a number between 1 to 10");
            }
            System.out.println();
            System.out.print("Enter \"1\" to play again: ");
            a = scanner.nextInt();
            System.out.println();

        } while (a == 1);

    }

    private static int GenRandomNumber(){
        Random random = new Random();
        int a = random.nextInt(1, 10);
        return a;
    }
}

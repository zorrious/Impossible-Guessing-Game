package ml.intrinix.impossibleguesser;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 1;
        do {
            int random = GenRandomNumber();
            System.out.print("Input a number from 1 to 10: ");
            int guesser = scanner.nextInt();

            if (guesser >= 1 && guesser <= 10) {
                while (random == guesser) {
                    if (random == guesser) {
                        random = GenRandomNumber();
                    }
                }
                if (random != guesser) {
                    System.out.println("Wrong guess");
                    System.out.println("The number was " + random);
                }
                if (random == guesser) {
                    System.out.println("Congratulation, You Beat The System");
                    break;
                }
            } else {
                System.out.println("The number you entered was out of range");
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

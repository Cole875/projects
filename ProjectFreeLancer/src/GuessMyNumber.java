import java.util.Scanner;
import java.lang.Math.*;

import static java.lang.Math.random;

public class GuessMyNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int randNum = (int)(Math.random() * 10 + 1);
        int lives = 3;
        System.out.println("Guess a number between 1 and 10.");
        System.out.print("You have " + lives + " lives remaining: ");
        System.out.println();
        int input = sc.nextInt();
        while (input != randNum) {
            lives--;
            if (lives == 0) {
                System.out.println("You lose");
                System.exit(1);
            }
            System.out.println("You failed to guess the random number.");
            System.out.println("You have " + lives + " lives remaining: ");
            input = sc.nextInt();

        }
        System.out.println("You guessed the random number!");





    }
}

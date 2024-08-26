import java.util.*;

public class guessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner in = new Scanner(System.in);

        int num, range, guess = -1, chances, rounds, count = 0, tries, roundsWon = 0;

        System.out.println("\nNumber Guessing Game!\n");
        System.out.println("Settings:");
        System.out.print("Choose a range to guess the number from: ");
        range = in.nextInt();
        System.out.print("Choose number of attempts to guess the number: ");
        chances = in.nextInt();
        System.out.print("Choose number of rounds to play the game: ");
        rounds = in.nextInt();

        while (count != rounds) {
            System.out.println("\nRound " + (count + 1) + ":");

            num = random.nextInt(range) + 1;
            System.out.printf("A random number has been generated between 0 to %d!\nCan you guess the number?\n", range);

            tries = chances;

            while ((num != guess) && (tries > 0)) {
                System.out.print("\nGuess the number: ");
                guess = in.nextInt();

                if (guess > num) {
                    System.out.println("Too high, guess lower!");
                } else if (guess < num) {
                    System.out.println("Too low, guess higher!");
                }

                tries--;
            }

            if (num == guess) {
                System.out.println("You have guessed the number, good job!");
                roundsWon++;
            } else {
                System.out.println("You have run out of chances! The correct number was " + num + ".");
            }

            count++;
            guess = -1;
        }
        System.out.printf("\nScore: You won %d out of %d rounds!\n", roundsWon, rounds);
        System.out.println("\nGAME OVER!\n");
        in.close();
    }
}
import java.util.Scanner;
import java.util.Random;

public class HighorLow {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int number = random.nextInt(10) + 1;
        int guess;

        do {
            System.out.print("Guess a number between 1 and 10: ");

            while (!input.hasNextInt()) {
                System.out.println("Invalid input. Enter a whole number.");
                input.next();
            }

            guess = input.nextInt();

            if (guess < 1 || guess > 10) {
                System.out.println("Invalid input. Enter a number from 1 to 10.");
            }

        } while (guess < 1 || guess > 10);

        System.out.println("The random number was: " + number);

        if (guess > number) {
            System.out.println("Your guess was too high!");
        }
        else if (guess < number) {
            System.out.println("Your guess was too low!");
        }
        else {
            System.out.println("On the money!");
        }
    }
}
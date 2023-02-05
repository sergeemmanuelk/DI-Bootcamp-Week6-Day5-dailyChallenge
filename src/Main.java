import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int target = rand.nextInt(100) + 1;
        int guess = 0;

        System.out.println("Enter a number between 1 and 100:");

        while (guess != target) {
            guess = sc.nextInt();
            if (guess < target) {
                System.out.println("The number is higher. Guess again:");
            } else if (guess > target) {
                System.out.println("The number is lower. Guess again:");
            }
        }

        System.out.println("You guessed it! The number was " + target);
    }
}
import java.util.Scanner;
import java.util.Random;

/** A number guessing game. */
public class Game {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Welcome to the guessing game!");
    System.out.println("Please enter your name: ");
    String name = scan.nextLine();
    // System.out.println(name + ", I'm thinking of a number between 0 and 100.");
    System.out.printf("%s, I'm thinking of a number between 0 and 100.", name);

    Random rand = new Random();
    int number = rand.nextInt(101);

    int counter = 0; // counter to increment for each wrong guess
    int guess; // this is user input for guess

    System.out.print(" Guess a number: ");
    guess = scan.nextInt();
    counter++;

    while(guess != number){
      if (guess > number) {
        System.out.println("Too high! Guess another number: ");
        guess = scan.nextInt();
        counter++;
      } else if (guess < number) {
        System.out.println("Too low!  Guess another number: ");
        guess = scan.nextInt();
        counter++;
      }
    }
    System.out.println("You got the correct number!");
    System.out.println("You guessed the number in " + counter + " tries.");
    scan.close();
  }
}

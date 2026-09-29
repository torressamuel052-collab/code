import java.util.Scanner;

public class NumberGuesser {

    public static final int LOWER = 0;
    public static final int UPPER = 100;
    public static int secret;
    public static Scanner scanner = new Scanner(System.in);

    public static void setup() {
        secret = (int) (Math.random() * 100);
        System.out.println("I alredy piked you secret number" + LOWER + " and " + (UPPER - 1) + "!");
    }

    public static int askGuess() {
        System.out.print("Enter your guess:");
        if (scanner.hasNextInt()) {
            int guess = scanner.nextInt();
            scanner.nextLine(); 
            return guess;
        } else {
            System.out.println("Hey, that's not an int");
            scanner.nextLine(); 
            return -1;
        }
    }

    public static int tryGuess(int guess) {
        if (guess == secret) {
            System.out.println("got it");
            return 0;
        } else if (guess < secret) {
            System.out.println("too low");
            return -1;
        } else {
            System.out.println("too high");
            return 1;
        }
    }

    

    

}
      
    
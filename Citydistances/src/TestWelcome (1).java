import java.io.IOException;
import java.util.Scanner;


/**
 * A sample class to demonstrate the use of the Scanner class to read input from the user and print a welcome message.
 * @author Christopher Owens
 * @version 1.0
 * @since 2024-06-10
 */
class TestWelcome {
    /**
     * 
     * @param args The command line arguments passed to the main method
     * @throws IOException if the scanner runs into trouble reading the input from the user
     */
    public static void main(String[] args) throws IOException {
    

        System.out.println("Hello, welcome to your 1,000th Java program! Please type your name:");

        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();

        System.out.println("\nHello " + name + ", welcome to your latest Java program!");
        scan.close();
    }
}
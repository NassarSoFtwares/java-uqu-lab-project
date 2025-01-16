package app;

import java.util.Scanner;//write an import statement to include the Scanner class
import java.util.Random;//write an import statement to include the Random class

/*
 * Students Name: 
 * IDs: 
 * Group: 
 */

/*
 * Program Class Definition
 */
public class App {

    // declare a constant named "PROGRAM" of type String and give it the value:
    // "Simple Operations Program"
    private static final String PROGRAM = "Simple Operations Program";

    /*** generateIncrementalOutput() method ***/
    /*
     * This method accepts two integer parameters: 'start' and 'end'. Return nothing. 
     * It validates if 'start' is smaller than 'end'. 
     * If not, it prints an error message and returns without generating any output.
     * If the validation passes, it proceeds to generate the incremental output 
     * starting from 'start' and incrementing by 5 until it reaches or surpasses 'end'. 
     * For example, if start=10,end=30, the output is 10 15 20 25 30 
     * 
     * Example of Invalid values, if start=50,end=30 , the output 
        "Error: The first integer must be smaller than the second integer".
    */

    public static void generateIncrementalOutput(int start, int end) {
        if (start >= end) {
            System.out.println("Error: The first integer must be smaller than the second integer");
            return;
        }

        for (int i = start; i <= end; i += 5) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    /***************End of generateIncrementalOutput Method*****************/

    // write a static method named "guessingNumber" that 
    // takes one integer number as a parameter between the range of 1 to 100
    // and returns true if the number matches a random number and displays "Congratulations!"
    // else method returns false if the number is less than the random number and displays "Too low!"
    // otherwise the method returns false if the number is greater than the random number and displays "Too high!"

    public static boolean guessingNumber(int number) {
        Random rng = new Random();
        int randomNumber = rng.nextInt(100) + 1; // Random number between 1 and 100

        if (number == randomNumber) {
            System.out.println("Congratulations!");
            return true;
        } else if (number < randomNumber) {
            System.out.println("Too low!");
            return false;
        } else {
            System.out.println("Too high!");
            return false;
        }
    }

    /***************End of guessingNumber Method*****************/

    /*
     * main()
     *
     * Program execution begins with this method.
     */
    public static void main(String[] args) {
        // write a print statement to display the value of the constant "PROGRAM" 
        System.out.println(PROGRAM);

        // declare a Scanner's Object to read user's inputs
        Scanner scanner = new Scanner(System.in);

        // declare two variables named 'start' and 'end' of type integer. 
        // Prompt the user to enter two numbers, and clearly tell them: 
        // "Please ensure that the second number is larger than the first number."
        System.out.print("Enter the first number (start): ");
        int start = scanner.nextInt();
        
        System.out.print("Enter the second number (end): ");
        int end = scanner.nextInt();

        // declare an integer variable named 'number'. Then prompt user to enter the value. 
        System.out.print("Enter a number between 1 and 100: ");
        int number = scanner.nextInt();

        // Call the methods
        generateIncrementalOutput(start, end);
        guessingNumber(number);


    }
}

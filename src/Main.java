/* @author Ahmet Hacioglu
 *
 * Student ID: 041801123
 *
 * Date: 12/10/2020
 *
 * Code Summary: This program asks the user to enter a random numbers.
 * Firstly, if the user enters the number of zero, the program subtracts the number of zero.
 * Finally, if the numbers entered by the user are less than 10 or equal to 10,
 * the program calculates the average of these integers.
 * If all values entered by user are greater than 10,
 * the program don't calculate the average.
 *
 */

import java.util.Scanner; // Program uses class Scanner

public class Main {

    /** Main method */
    public static void main(String[] args) {

        // Declare and initialize variables
        int number = 0;
        int counter = 0;
        // Create a Scanner
        Scanner s = new Scanner(System.in);

        // I defined the array size high because we don't know how many inputs will come.
        int[] numbers = new int[100];

        // The user enters any integer.
        System.out.println("Please enter integers (enter 0 to stop):");

        // Zero is a special number. We don't want to use number of zero .
        // In the following part, the program subtracts the number of zero if the user
        // want to use it.
        for (int i = 0; i < 100; i++) {
            number = s.nextInt();
            if (number == 0) {
                break;
            }
            numbers[i] = number;
            counter++;
        }
        System.out.println("Input Sequence:");
        for (int j = 0; j < counter; j++) {
            System.out.print(numbers[j] + " ");
        }
        System.out.println(" ");
        computeAverage(numbers, counter);

    }

    /** Average calculation in method */
    static void computeAverage(int[] numbers, int counter) {

        // Declare and initialize variables
        int counter2 = 0;
        double sum = 0;

        // Calculation of the average of numbers up to 10 by using for loops.
        int[] aveArray = new int[10];

        // Numbers return up to 10 by using for loops.
        for (int i = 0; i < counter; i++) {
            if (numbers[i] <= 10) {
                aveArray[counter2] = numbers[i];
                counter2++;
            }
        }

        // If the numbers are greater than 10, the average is not calculated.
        if (aveArray[0] == 0) {
            System.out.println("There are no integers less than or equal to 10 in the input sequence.");
        } else {
            System.out.println("Integers that are less than or equal to 10 are :");

            // In this part, If the numbers are less than or equal to 10
            // The program calculate the average of numbers.
            for (int j = 0; j < counter2; j++) {
                System.out.print(aveArray[j] + " ");
                sum = sum + aveArray[j];

            }

            System.out.println(" ");
            sum = sum / counter2;
            System.out.println("Average is:" + sum);
        }

    }

}
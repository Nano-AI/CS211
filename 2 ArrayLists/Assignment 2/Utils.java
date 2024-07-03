/**
 * Helpful functions used in the program
 * @author Aditya Bankoti
 * @date July 2, 2024
 */

import java.util.Scanner;

public class Utils {
    /**
     * Converts space-split-integers-from-scanner to an integer array
     * @param s Scanner to take input from
     * @return Return integer array from scanner
     */
    public static int[] nextInts(Scanner s) {
        // get line
        String values = s.nextLine();
        // split
        String[] split = values.split(" ");
        // create return array
        int[] numbers = new int[split.length];

        // convert string to int & add to numbers
        for (int i = 0; i < split.length; i++) {
            numbers[i] = Integer.parseInt(split[i]);
        }

        // return numbers
        return numbers;
    }
}

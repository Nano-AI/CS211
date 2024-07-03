/**
 * Utils class for useful functions
 * @author Aditya Bankoti
 * @date July 1, 2024
 */

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Utils {
    public static final int EXIT_CODE = -2; // exit code
    public static final int ERROR_CODE = -1; // error code

    /**
     * Format integer to dollar format. E.x. 1928354.75 -> $1,928,354.75
     * @param money Money as a number
     * @return Money as a formatted string
     */
    public static String moneyToString(int money) {
        // create locale
        Locale locale = new Locale("en", "US");
        // create formatter from locale
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);
        // return formatted values
        return currencyFormatter.format(money);
    }

    /**
     * If char is a vowel
     * @param v char to check vowel
     * @return if parameter is a vowel
     */
    public static boolean isVowel(char v) {
        // lower case
        v = Character.toLowerCase(v);
        // return vowels
        return v == 'a' || v == 'e' || v == 'i' || v == 'o' || v == 'u';
    }

    /**
     * Gets integer and returns exit_code if "q" is entered, and error_code
     * if it goes outside of [1, max]
     * @param scanner scanner for input
     * @param max maximum value allowed
     * @return error code or value selected
     */
    public static int getInteger(Scanner scanner, int max) {
        String stringChoice = scanner.nextLine();
        if (stringChoice.toLowerCase().startsWith("q")) {
            return EXIT_CODE;
        }

        int choice;
        try {
            choice = Integer.parseInt(stringChoice);
        } catch (NumberFormatException e) {
            choice = 0;
        }

        if (choice <= 0 || choice > max) {
            return ERROR_CODE;
        }

        return choice;
    }
}

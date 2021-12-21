/*
* The "Palindrome" program figures out what depth of a palindrome every
* two digit number is
*
* @author  Myles Trump
* @version 1.0
* @since   2021-12-20
*/

import java.util.Scanner;

/**
* This is a program that blanks.
*/
final class Palindrome {

    /**
    * 10.
    */
    public static final int C10 = 10;

    /**
    * 100.
    */
    public static final int C100 = 100;

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private Palindrome() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The isValid function.
    *
    * @param 
    */
/**    public static void int isValid(final int startingInteger,
        final int reversed, final int loop, final int conversionOutlet) {

        loop = loop + 1;
        int firstHalf;
        int secondHalf;
        int possiblePalindrome = reversed + conversionOutlet;
        if (possiblePalindrome < C10) {
            firstHalf = ((int) (possiblePalindrome / C10)) * C10;
            secondHalf = possiblePalindrome % C10;

        } else if (possiblePalindrome < C100) {
            firstHalf = ((int) (possiblePalindrome / C100)) * C100;
            secondHalf = possiblePalindrome % C100;

        } if (firstHalf == secondHalf) {
            System.out.println(startingInteger + " has a depth " + loop +
            " palindrome.");

        } else {
            // run loop until num becomes 0
            while(possiblePalindrome != 0) {
    
                // get last digit from num
                int digit2 = possiblePalindrome % C10;
                reversed = reversed * C10 + digit2;

                // remove the last digit from num
                possiblePalindrome /= C10;

        }
    }
}
*/
    /**
    * The palindrome() function .
    *
    * @return pass the results to another function
    * @param startingInteger starts at 1 gets increased each round to a max
    * of 99
    * @param conversionOutlet same as startingInteger except is used in calcs
    */
    public static int palindrome(final int startingInteger,
        final int conversionOutlet) {

        if (startingInteger < C100) {
            conversionOutlet = startingInteger;

            if (startingInteger >= C10) {
                // "borrowed" from
//https://www.programiz.com/java-programming/examples/reverse-number
                // run loop until num becomes 0
                while(conversionOutlet != 0) {
    
                    // get last digit from num
                    int digit = conversionOutlet % C10;
                    reversed = reversed * C10 + digit;

                    // remove the last digit from num
                    conversionOutlet /= C10;
                }
                //int loop = 1;
                //isValid(startingInteger, reversed, loop, conversionOutlet);
                //palindrome(startingInteger, conversionOutlet);
            }
        }
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {
        // variables
        int startingInteger = 1;
        int conversionOutlet = 1;

        palindrome(inputtedInteger, conversionOutlet);

        System.out.println("\nDone.");
    }
}

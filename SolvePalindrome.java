/*
* The "SolvePalindrome" program figures out what depth of a palindrome every
* two digit number is
*
* @author  Myles Trump
* @version 1.0
* @since   2021-12-20
*/

/**
* This is a program that blanks.
*/
final class SolvePalindrome {

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
    private SolvePalindrome() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The isPalindrome() function.
    *
    * @return true or false
    * @param testInt tests to see if this is a palindrome
    */
    public static boolean isPalindrome(final int testInt) {
        int reversed;

        reversed = reverseNumber(testInt);

        if (reversed == testInt) {
            return true;
        }
        return false;
    }

    /**
    * The reverseNumber() function.
    *
    * @return reversed number
    * @param sourceNum number to be reversed
    */
    public static int reverseNumber(final int sourceNum) {
        int digit;
        int reversed = 0;
        int num = sourceNum;
        // run loop until num becomes 0
        while (num != 0) {

            // get last digit from num
            digit = num % C10;
            reversed = reversed * C10 + digit;

            // remove the last digit from num
            num /= C10;
        }
        return reversed;
    }

    /**
    * The findDepth() function.
    *
    * @return palindrome depth number
    * @param testInt number to test if its a palindrome
    * @param depth starting depth
    */
    public static int findDepth(final int testInt, final int depth) {
        if (isPalindrome(testInt) == true) {
            return depth;

        } else {
            int reversed = reverseNumber(testInt);
            int nextInt = reversed + testInt;
            return findDepth(nextInt, depth + 1);
        }
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {
        // variables
        for (int testInt = 1; testInt < C100; testInt++) {
            int depth = findDepth(testInt, 0);
            System.out.println(testInt + " has a palindrome depth of " + depth);

        }
        System.out.println("\nDone.");
    }
}

 package legecy.panda;

/**
 * @author Joshua Tanaka Masunda
 * @version 1.0
 * 
 * This class contains methods related to handling numbers in whole number form.
 * It includes functionality for counting the digits of a number.
 */

 public class NumberInWhole
 {
    /**
     * Returns the number of numbers that are in a whole number.
     * 
     * @param intNum The number we want to find the total digits
     * @return result of iterations
     */

    public static int numbersInWhole(int intNum)
    {
        int intCounter = 0;
        while(intNum != 0)
        {
            intNum /= 10;
            intCounter++;
        }

        return intCounter;
    }
 }

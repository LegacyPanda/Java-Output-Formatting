import java.util.Scanner;
import legecy.panda.NumberInWhole;

/**
 * @author Joshua Tanaka Masunda
 */

public class Main
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        int intInputs;
        String strWord;
        int intNum;

        System.out.print("How many sets of inputs");
        intInputs = obj.nextInt();
        obj.nextLine();

        for(int i = 0; i < intInputs; i++)
        {
            System.out.print("Enter a string less than 10 alphabetic characters: ");
            strWord = obj.nextLine();
   
            System.out.print("Enter an integer between 0 and 999: ");
            intNum = obj.nextInt();
            obj.nextLine();

            if(strWord.length() > 10 || (intNum < 0 || intNum > 999))
            {
                System.out.println("Instructions were not followed. Shutting down!");
                System.exit(0);
            }

            if(NumberInWhole.numbersInWhole(intNum) < 2)
            {
                System.out.println("================================");
                System.out.printf("%s 00%d\n", strWord, intNum);
                System.out.println("================================");
            }else if(NumberInWhole.numbersInWhole(intNum) < 3)
            {
                System.out.println("================================");
                System.out.printf("%s 0%d\n", strWord, intNum);
                System.out.println("================================");
            }            
            else
            {
                System.out.println("================================");
                System.out.printf("%s %d\n", strWord, intNum);
                System.out.println("================================");
            }
        }

        obj.close();
    }
} 

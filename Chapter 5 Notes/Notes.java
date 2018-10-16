import java.util.Scanner;
/**
 * Write a description of class Notes here.
 *
 * @author Jimit
 * @version october 16 2018
 */
public class Notes
{
    public static void ifExample()
    {
        //model a coin flip; 1 is heads 0 is tails
        int coinFlip= (int)(Math.random()*2);
        /*
         * if statememt 
         * statements are executed if the conditonal expression is true. 
         * conditional expressions must go inside of parentheses
         * statements are grouped by blocks i.e{} not grouped by indentation like
         * in pyton
         * There is no colon after ghd condditonal expression unlike python
         * 
         */
        if (coinFlip==1)
        {
            System.out.println("coin is heads!");
            
        }
        /*
         * {} are not required for a single stement.
         * Howerver they are always a good idea 
         * leaving them out can lead to bugs like this
         * 
         */
        if (coinFlip==0)
            System.out.println("coin is tails!");
            System.out.println("better luck next time");
        /*
         * if-else statement
         * else block is executed if the condition for the if is false
         */
        
        if (coinFlip==1)
        {
            System.out.println("coin is heads!");
            
        }
        else
        {
            System.out.println("coin is tails!");
            System.out.println("better luck next time");
        }
    
    //simulate the roll of a four sided die[1-4]
    int dieRoll= (int)((Math.random()*4)+1);
    /*
     * if-else statement
     * if java else if is used instead of elif
     */
    if (dieRoll==1)
    {
    
        System.out.println("you rolled a 1");
    }
    else if (dieRoll==2)
    {
        System.out.println("you rolled a 2");
    }
    else if (dieRoll==3)
    {
        System.out.println("you rolled a 3");
    }
    else
    {
        System.out.println("you rolled a 4");
    }
}
public static boolean doublesAreEqual(double num1, double num2)
{
    /*
     * if we use the equality operator (==) for double, it will only retuern 
     * true if all binary digits match.
     * for equal numbers this is probably not the case due to floating- point
     * rounding ans therefore not what we want
     * we will check if they are close enough(ie epsilon value)
     */
    final double EPSILON = 1e-14;
    if (Math.abs(num1-num2)<EPSILON)
    {
        return true;
    }
    else{
     return false;
    }
    
    // dont have to use an if statement
    //return Math.abs(num1-num2)<EPSILON;
}
public static void stringExample()
{
    Scanner s = new Scanner(System.in);
    System.out.println("Enter two strings: ");
    String str1 = s.next();
    String str2 = s.next();
}
}
